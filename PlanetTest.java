import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest {

  Planet planet;

  @Before
  public void before() {
    planet = new Planet("Earth", "12,742km");
  }

  @Test
  public void hasName() {
    assertEquals("Earth", planet.getName());
  }

  @Test
  public void hasSize() {
    assertEquals("12,742km", planet.getSize());
  }

  @Test
  public void explode() {
    assertEquals("BOOM! Earth has exploded.", planet.explode());
  }

}