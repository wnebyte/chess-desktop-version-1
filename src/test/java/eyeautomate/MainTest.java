package eyeautomate;

import app.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import model.graphic.Board;
import model.graphic.Square;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import util.StateGenerator;

import java.util.Arrays;
import java.util.List;


public class MainTest extends ApplicationTest
{
    private Parent mainNode;

    @Override
    public void start(Stage stage) throws Exception
    {
        mainNode = FXMLLoader.load(Main.class.getResource("/view/Board.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception
    {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    @Test
    public void test()
    {
        Node node = mainNode.lookup("#board");
        Board board = (Board) node;
        board.clear();
        StateGenerator.lonelyWhitePawn(board);

        Square square = board.get('D', 2);
        clickOn(square, MouseButton.PRIMARY);
        Assert.assertTrue(board.isQueued());

        List<Square> legal = Arrays.asList(board.get('D', 3), board.get('D', 4));
        Assert.assertEquals(legal, board.getLegal());

        clickOn(board.get('D', 3));
        Assert.assertFalse(board.isQueued());
        Assert.assertEquals(0, board.getLegal().size());

    }

    public void testWhitePawnMoves()
    {
        ScriptLogger scriptLogger = new ScriptLogger();
        scriptLogger.setExecutionLog(
                this.getClass().getResource("/eyeautomate/logs/execution_log.txt").toExternalForm()
        );
        ScriptRunner scriptRunner = new ScriptRunner(scriptLogger);
        scriptRunner.setParameter("ImageFolder",
                this.getClass().getResource("/eyeautomate/images").toExternalForm());
        scriptRunner.runScript(
                this.getClass().getResource("/eyeautomate/scripts/test.txt").toExternalForm());
    }
}
