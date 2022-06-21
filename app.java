package Trabalhos_poo.TrabalhoPOO3;

public class App {
    public static void main(String[] args) {
        PessoaDAO pDao = new PessoaDAO();
        int iP1 = 1;
        String nP1 = "Miguel";
        Pessoa pessoa1 = new Pessoa(iP1, nP1);
        pDao.addPessoa(pessoa1);
        int iP2 = 2;
        String nP2 = "Camila";
        Pessoa pessoa2 = new Pessoa(iP2, nP2);
        pDao.addPessoa(pessoa2);
        int iP3 = 3;
        String nP3 = "Gabriel";
        Pessoa pessoa3 = new Pessoa(iP3, nP3);
        pDao.addPessoa(pessoa3);
        System.out.println(pDao.getPessoas());
        pDao.deletePessoa(pessoa2);
        System.out.println(pDao.getPessoas());
        pDao.getById(iP1);
        pDao.getById(iP2);
        
    }
}
