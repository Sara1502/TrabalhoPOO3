package Trabalhos_poo.TrabalhoPOO3;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private Pessoa pessoa;
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void deletePessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void getById(int idp){
        boolean achou = false;
        for (Pessoa pessoa : pessoas) {
            if(idp == pessoa.getId()){
                System.out.println(pessoa);
                achou = true;
                break;
            }
        }
        if(achou == false){
            System.out.println("Não foi possivel encontrar este ID");
        }
    }
    public PessoaDAO() {
    }

}
