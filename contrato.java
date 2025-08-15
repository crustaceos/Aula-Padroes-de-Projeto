///SE EU COLOCAR UM ABSTRACT DEPOIS DO PUBLIC ALI EMBAIXO, EU NÃO VOU MIAS PPERMITIR QUE SEJAM CRIADAS OUTROS CONTRATOS. 
/// ELE É UM CONSTRUTOR, OU SEJA, PERMITE CRIAR OUTROS CONTRATOS, SE TIVESSE PRIVATE OU ABSTRACT ELE NÃO PERMITE MAIS
public abstract class contrato{
    public String situacao;
    public String data_encerramento;

    public boolean Salvar(){
        //Implementação base do Salvar
        return true;
    }


}