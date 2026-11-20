package dao;

import modelo.Sucursal;

import java.util.List;

public interface SucursalDAO {

    void guardar(Sucursal sucursal);
    void eliminar(int id);
    Sucursal buscarPorId(int id);
    List<Sucursal> listarTodos();
}