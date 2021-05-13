
package atividade4;

public class Vendedor extends Funcionario{
    private float totalVendas;
    private float comissao;
    private Gerente responsavel;
    
    @Override
    public float getSalario(){
        return this.totalVendas*this.comissao;
    }
    
    public void setResponsavel(Gerente responsavel) {
        this.responsavel = responsavel;
        responsavel.adicionarVendedor(this);
    }
    
    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public Gerente getResponsavel() {
        return responsavel;
    }

    
    
}
