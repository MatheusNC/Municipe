package programa;

import cadastro.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exemplo extends Menu{
    public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        Menu menu = new Menu();
        menu.selecionarMenu(pessoas);
    }
}