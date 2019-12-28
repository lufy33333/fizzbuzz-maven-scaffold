import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class GameStartTest {

    @Test
    void start() {
        GameStart gs = new GameStart();
        assertThat(gs.start("1567").equals("4A0B"));
    }
}