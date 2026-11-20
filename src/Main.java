import dao.SucursalDAO;
import dao.SucursalDAOMemoria;
import modelo.Sucursal;

void main() {
    SucursalDAO dao = new SucursalDAOMemoria();

    dao.guardar(new Sucursal(1,"Casa Matriz"));
    dao.guardar(new Sucursal(2,"Sucursal Norte"));
    dao.guardar(new Sucursal(2,"Sucursal Sur"));
    dao.guardar(new Sucursal(3,"Sucursal Centro"));

    int idBusqueda1 = 1;
    Sucursal encontrado = dao.buscarPorId(idBusqueda1);
    if (encontrado != null){
        System.out.println("Sucursal con id " + idBusqueda1 + " encontrada exitosamente!!!");
        System.out.println(encontrado);
        System.out.println("");
    }
    else{
        System.out.println("La sucursal con id " + idBusqueda1 + " no pudo ser encontrada...");
        System.out.println("");
    }

    int idBusqueda2 = 7;
    encontrado = dao.buscarPorId(idBusqueda2);
    if (encontrado != null){
        System.out.println("Sucursal con id " + idBusqueda2 + " encontrada exitosamente!!!");
        System.out.println(encontrado);
        System.out.println("");
    }
    else{
        System.out.println("La sucursal con id " + idBusqueda2 + " no pudo ser encontrada...");
        System.out.println("");
    }

    System.out.println("Esta es la lista de todas las sucursales actualmente:");
    for (Sucursal s : dao.listarTodos()){
        System.out.println(s);
    }
    System.out.println("");

    dao.eliminar(3);
    dao.eliminar(9);

    System.out.println("Esta es la lista de todas las sucursales actualmente:");
    for (Sucursal s : dao.listarTodos()){
        System.out.println(s);
    }
    System.out.println("");
}