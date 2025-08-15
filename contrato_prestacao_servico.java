
public class contrato_prestacao_servico extends contrato {
    //Adicionar uma propriedade 
    public String servico_contratado;

    @Override
    public boolean Salvar(){
        System.out.println("Salvanado contrato de serviços");
        return true;
    }
}
