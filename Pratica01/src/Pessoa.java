public class Pessoa {
    private String Nome;
    private String Sobrenome;
    private int idade;
    private Double altura;
    private Double peso;
    private Double IMC;

    public Pessoa(){
        Nome = "";
        Sobrenome = "";
        idade = 0;
        altura = 0.0;
        peso = 0.0;
        IMC = 0.0;
    }

    public void setNome(String nome) {Nome = nome;}
    public String getNome() {return Nome;}

    public void setSobrenome(String sobrenome) {Sobrenome = sobrenome;}
    public String getSobrenome() {return Sobrenome;}

    public void setIdade(int idade) {this.idade = idade;}
    public int getIdade() {return idade;}

    public void setAltura(Double altura) {this.altura = altura;}
    public Double getAltura() {return altura;};

    public void setPeso(Double peso) {this.peso = peso;}
    public Double getPeso() {return peso;}

    public void setIMC(Double IMC) {this.IMC = IMC;}
    public Double getIMC() {return IMC;}

    public void CalculaIMC(){
        setIMC(getPeso()/(Math.pow(getAltura(), 2)));
    }

    public void InformaObesidade(){
        if (getIMC() < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (getIMC() >= 18.5 && getIMC() <= 24.9){
            System.out.println("Peso normal");
        }
        else if (getIMC() >= 25 && getIMC() <= 29.9){
            System.out.println("Sobrepeso");
        }
        else if (getIMC() >= 30 && getIMC() <= 34.9){
            System.out.println("Obesidade grau 1");
        }
        else if (getIMC() >= 35 && getIMC() <= 39.9){
            System.out.println("Obesidade grau 2");
        }
        else if (getIMC() > 40){
            System.out.println("Obesidade grau 3");
        }
    }
}
