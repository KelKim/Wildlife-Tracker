import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class AnimalsTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void animals_instantiatesCorrectly_true() {
    Animals testAnimals = new Animals("Bubbles", 1);
    assertEquals(true, testAnimals instanceof Animals);
  }
  @Test
  public void Animals_instantiatesWithPersonId_int() {
    Animals testAnimals = new Animals("Bubbles", 1);
    assertEquals(1, testAnimals.getId());
  }
}