public class Pessoa {
    String nome;
    String dataNacimento;

    public Pessoa (String nome,String dataNacimento){
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNacimento (){
        return dataNacimento;
    }


    public void setDados(String nome, String dataNacimento) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }
}