package programa;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import cadastro.Pessoa;
import cadastro.RG;
import cadastro.Dependente;
import cadastro.Eleitor;
import cadastro.Escolaridade;
import cadastro.Localizacao;
import cadastro.Profissional;
import cadastro.Religiao;
import cadastro.Sindicato;

public class Menu {
    public void selecionarMenu(List<Pessoa> pessoas) throws IOException {
        Scanner sc = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("CADASTRO DE MUNICIPE");
            System.out.println("0 - Cadastrar | 1 - Imprimir na tela todos os nomes | 2 - Excluir munícipe | 3 - Finalizar programa");
            escolha = sc.nextInt();
            switch (escolha){
                case 0:
                    inserir(pessoas, sc);
                    break;
                case 1:
                    imprimirNomes(pessoas);
                    break;
                case 2:
                    remover(pessoas, sc);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
            }
        } while (escolha == 0 || escolha == 1 || escolha == 2);
        sc.close();
    }

    public void remover(List<Pessoa> pessoas, Scanner scanner) throws IOException {
        Pessoa p = new Pessoa();
        System.out.println("--== EXCLUIR MUNICIPE ==--");
        System.out.print("Digite o CPF do munícipe que deseja remover: ");
        double cpf = scanner.nextDouble();
        for (int i = 0; i < pessoas.size(); i++) {
            p = pessoas.get(i);
            if (p.getCPF() == cpf) {
                pessoas.remove(i);
                System.out.println( p.getNomeCompleto().toUpperCase() + " REMOVIDO!\n");
            }
        }
    }

    public void inserir(List<Pessoa> pessoas, Scanner sc) throws IOException {
        Pessoa pessoa = new Pessoa();
        RG rg = new RG();
        Eleitor eleitor = new Eleitor();
        Localizacao localizacao = new Localizacao();
        Dependente pai = new Dependente();
        Dependente mae = new Dependente();
        Profissional profissional = new Profissional();
        Escolaridade escolaridade = new Escolaridade();
        Religiao religiao = new Religiao();
        Sindicato sindicato = new Sindicato();

        System.out.println("-= Dados Pessoais =-");
        System.out.println("\nDigite o nome: ");
        String nome = null;
        sc.nextLine();
        nome = sc.nextLine();
        pessoa.setPrimeiroNome(nome);

        System.out.println("\nSobrenome: ");
        String sobrenome = null;
        sobrenome = sc.nextLine();
        pessoa.setSobrenome(sobrenome);

        System.out.println("\nDigite o CPF: ");
        double cpf = 0;
        cpf = sc.nextDouble();
        sc.reset();
        pessoa.setCPF(cpf);

        System.out.println("\nData de nascimento: ");
        String dtNasc = null;
        sc.nextLine();
        dtNasc = sc.nextLine();
        pessoa.setDataNascimento(dtNasc);

        System.out.println("\nSexo: ");
        String sexo = null;
        sexo = sc.nextLine();
        pessoa.setSexo(sexo);

        System.out.println("\nEstado cívil: ");
        String ec = null;
        ec = sc.nextLine();
        pessoa.setEstadoCivil(ec);

        System.out.println("\nNacionalidade: ");
        String n = null;
        n = sc.nextLine();
        pessoa.setNacionalidade(n);

        System.out.println("-= RG =-");
        System.out.println("\nNúmero: ");
        String rgNo = null;
        rgNo = sc.nextLine();
        rg.setRgNo(rgNo);

        System.out.println("\nEmissor: ");
        String emissor = null;
        emissor = sc.nextLine();
        rg.setEmissor(emissor);

        System.out.println("\nUF: ");
        String uf = null;
        uf = sc.nextLine();
        rg.setUf(uf);

        System.out.println("\nData Expedição: ");
        String dataExp = null;
        dataExp = sc.nextLine();
        rg.setDataExpedicao(dataExp);

        System.out.println("\nNaturalidade: ");
        String nat = null;
        nat = sc.nextLine();
        rg.setNaturalidade(nat);

        System.out.println("-= Eleitor =-");

        System.out.println("\nTítulo: ");
        String titulo = null;
        titulo = sc.nextLine();
        eleitor.setTitulo(titulo);

        System.out.println("\nSeção: ");
        String secao = null;
        secao = sc.nextLine();
        eleitor.setSecao(secao);

        System.out.println("\nZona: ");
        String zona = null;
        zona = sc.nextLine();
        eleitor.setZona(zona);

        pessoa.setEleitor(eleitor);

        System.out.println("-= Localização =-");
        System.out.println("\nEndereço: ");
        String endereco = null;
        endereco = sc.nextLine();
        localizacao.setEndereco(endereco);

        System.out.println("\nNúmero: ");
        int numero = 0;
        numero = sc.nextInt();
        sc.reset();
        localizacao.setNumeroEndereco(numero);
        
        System.out.println("\nBairro: ");
        String bairro = null;
        sc.nextLine();
        bairro = sc.nextLine();
        localizacao.setBairro(bairro);

        pessoa.setLocalizacao(localizacao);

        System.out.println("-= Dependente =-");
        System.out.println("\nPrimeiro nome pai: ");
        String nomePai = null;
        nomePai = sc.nextLine();
        pai.setNomeDependente(nomePai);

        System.out.println("\nSobrenome pai: ");
        String sobrenomePai = null;
        sobrenomePai = sc.nextLine();
        pai.setSobrenomeDependente(sobrenomePai);

        System.out.println("\nPrimeiro nome mãe: ");
        String nomeMae = null;
        nomeMae = sc.nextLine();
        mae.setNomeDependente(nomeMae);

        System.out.println("\nSobrenome mãe: ");
        String sobrenomeMae = null;
        sobrenomeMae = sc.nextLine();
        mae.setNomeDependente(sobrenomeMae);

        mae.setResponsavel(pessoa);
        pai.setResponsavel(pessoa);

        System.out.println("-= Profissional =-");
        System.out.println("\nOcupação: ");
        String ocupacao = null;
        ocupacao = sc.nextLine();
        profissional.setOcupacao(ocupacao);
        
        System.out.println("\nEscolaridade: ");
        String escolari = null;
        escolari = sc.nextLine();
        escolaridade.setEscolaridade(escolari);

        System.out.println("\nOnde estuda?: ");
        String ondeEstuda = null;
        ondeEstuda = sc.nextLine();
        escolaridade.setLocalEstudo(ondeEstuda);

        System.out.println("\nPortador de necessidades: ");
        String portadorne = null;
        portadorne = sc.nextLine();
        pessoa.setPcd(portadorne);
    
        System.out.println("\nFormação: ");
        String formacao = null;
        formacao = sc.nextLine();
        profissional.setFormacao(formacao);

        profissional.setEscolaridade(escolaridade);
        pessoa.setProfissional(profissional);

        System.out.println("-= Sindicato =-");
        System.out.println("\nClube: ");
        String cb = null;
        cb = sc.nextLine();
        sindicato.setClube(cb);
        
        System.out.println ("\nAssociação: ");
        String associacao = null;
        associacao = sc.nextLine();
        sindicato.setAssociacao(associacao);

        System.out.println("\nNome Do sindicato: ");
        String Nomesindicato = null;
        Nomesindicato = sc.nextLine();
        sindicato.setNomeSindicato(Nomesindicato);
        
        pessoa.setSindicato(sindicato);
        
        System.out.println("-= Religião =-");
        System.out.println("\nNome: ");
        String nomeReligiao = null;
        nomeReligiao = sc.nextLine();
        religiao.setNome(nomeReligiao);

        System.out.println("\nTipo de crenca: ");
        String tpc = null;
        tpc = sc.nextLine();
        religiao.setTipoCrenca(tpc);
        
        pessoa.setReligiao(religiao);

        pessoas.add(pessoa);
        System.out.println("\nUsuário Cadastrado!!\n");
    }

    public void imprimirNomes(List<Pessoa> pessoas) {
        Pessoa p = new Pessoa();
        System.out.println("--== LISTA DE MUNICIPES ==--");
        if (pessoas.isEmpty()) {
            System.out.println("\nNão há pessoas cadastradas\n");
        } else {
            for (int i = 0; i < pessoas.size(); i++) {
                p = pessoas.get(i);
                System.out.println(p.getNomeCompleto());
            }
        }
        System.out.println("");
    }
}
