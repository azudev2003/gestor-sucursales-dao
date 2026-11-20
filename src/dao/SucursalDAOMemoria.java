package dao;

import modelo.Sucursal;

import java.util.List;

public class SucursalDAOMemoria implements SucursalDAO{
    @Override
    public void guardar(Sucursal sucursal) {

    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Sucursal buscarPorId(int id) {
        return null;
    }

    @Override
    public List<Sucursal> listarTodos() {
        return List.of();
    }
}
