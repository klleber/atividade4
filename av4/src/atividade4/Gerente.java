package atividade4;

import java.util.ArrayList;


public class Gerente extends Funcionario{
    private String departamento;
    private ArrayList<Vendedor> vendedores;
    
    
    public float getSalario(){
        float total = 0;
        for(int i = 0; i<this.vendedores.size(); i++){
            total += vendedores.get(i).getTotalVendas();
        }
        return total;
    }
    
    public void adicionarVendedor(Vendedor vendedor){
        this.vendedores.add(vendedor);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
