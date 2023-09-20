import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private List<Toy> listToy;
    private List<Integer> chanceList;
    private Random rnd;
    private List<Toy> winList;

    public Lottery () {
        chanceList = new ArrayList<>();
        listToy = new ArrayList<>();
        rnd = new Random();
        winList = new ArrayList<>();
    }

    public void add(int id, int chance, String name) {
        Toy toy = new Toy(id, name, chance);
        listToy.add(toy);
        for (int i = 0; i <= chance; i++) {
            chanceList.add(chance);
        }
    }

    public List<Toy> getList() {
        return listToy;
    }

    public void raffle() {
        int index = rnd.nextInt(chanceList.size());
        for (Toy toy : listToy) {
            if (toy.getChance() == chanceList.get(index)) {
                winList.add(toy);
            }
        }
        index = rnd.nextInt(winList.size());
        System.out.println("Вы выйгарли игрушки: " + winList.get(index));
        try {
            FileWriter fileWriter = new FileWriter("result.json", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String text = winList.get(index).toString() + "\n";
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
