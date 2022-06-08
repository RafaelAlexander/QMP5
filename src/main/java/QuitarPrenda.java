import java.util.List;

public class QuitarPrenda implements Propuesta {
  Prenda prenda;
  Boolean activo;

  @Override
  public void accion(List<Prenda> prendaList) {
    prendaList.remove(prenda);
  }

  @Override
  public void cambiarEstado() {
    activo = !activo;
  }
}
