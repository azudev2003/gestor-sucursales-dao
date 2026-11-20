package dao;

import modelo.Sucursal;

import java.util.ArrayList;
import java.util.List;

public class SucursalDAOMemoria implements SucursalDAO{
    private final List<Sucursal> listaSucursales = new ArrayList<>();

    @Override
    public void guardar(Sucursal sucursal) {
        if (buscarPorId(sucursal.getId()) == null){
            listaSucursales.add(sucursal);
            System.out.println("La sucursal: " + sucursal.getNombre() + " ha sido agregada exitosamente!!!");
            System.out.println("");
        }
        else {
            System.out.println("No se pudo agregar la sucursal: " + sucursal.getNombre()
                    + " porque ya existia una sucursal con id " + sucursal.getId() + "...");
            System.out.println("");
        }
    }

    @Override
    public void eliminar(int id) {
            for (Sucursal s : listaSucursales) {
                if (s.getId() == id) {
                    listaSucursales.remove(s);
                    System.out.println("La sucursal con id " + id + " Ha sido eliminada correctamente!!!");
                    System.out.println("");
                    return;
                }
            }

        System.out.println("No se pudo eliminar la sucursal con id " + id + " porque no existe...");
        System.out.println("");
    }

    @Override
    public Sucursal buscarPorId(int id) {
        for (Sucursal s : listaSucursales){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Sucursal> listarTodos() {
        return new ArrayList<>(listaSucursales);
    }
}