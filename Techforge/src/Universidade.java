public class Universidade {
    String nomeUniversidade;
    String materia;

    public Universidade( String nomeUniversidade,String materia){
        this.nomeUniversidade = nomeUniversidade;
        this.materia = materia;
    }

    public String getmateria(){
        return materia;
    }
    public String getNomeUniversidade(){
        return nomeUniversidade;
    }

    public void setUniversidade(String nomeUniversidade, String materia){
        this.nomeUniversidade = nomeUniversidade;
        this.materia = materia;
    }
}