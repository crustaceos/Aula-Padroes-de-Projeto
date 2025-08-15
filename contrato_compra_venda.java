public class contrato_compra_venda extends contrato{
    //Adiciona a propriedade mercadoria

    public String mercadoria;

    //Sobreescreve o Salvar 
    @Override
    public boolean Salvar(){
        if(this.mercadoria.equals("Alcool")){
            return false;
        }
        return true;
    }
}
