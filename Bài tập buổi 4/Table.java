import java.util.ArrayList;
import java.util.List;

class Table {
    private List<String> title = new ArrayList<>();
    private List<Integer> width = new ArrayList<>();
    private List<List<String>> data = new ArrayList<>();
    private final int widthOffset = 5;

    public Table() {
    }

    public Table(List<String> title) {
//        System.out.println(title.size());
        this.width.clear();
        this.data.clear();
        this.title.clear();
        this.title = title;
        setTitle(title);
    }

    private void setTitle(List<String> title) {
        for (int i = 0; i < title.size(); i++) {
            width.add(title.get(i).length() + widthOffset);
        }
//        System.out.println(title.size());
        for (int i = 0; i < title.size(); i++) {
            fitIn(title.get(i), i);
        }
    }

    private void fitIn(String str, int index) {
        if (str.length() + this.widthOffset > width.get(index)) {
            width.set(index, str.length() + widthOffset);
        }
    }

    public void addData(List<String> data) {
        this.data.add(data);
        for (int i = 0; i < data.size() - 1; i++) {
            fitIn(data.get(i), i);
        }
    }

    public void printData() {
        if (data.isEmpty()) {
            System.out.println("Không có dữ liệu");
            return;
        }
        for (int i = 0; i < title.size(); i++) {
            System.out.print(String.format("|%-"+width.get(i)+"s", title.get(i)));
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < width.size(); i++) {
            sum += width.get(i);
        }
        String str = "-".repeat(sum);
        for (int i = 0; i < data.size(); i++) {
            System.out.println(str);
            if(i != data.size() - 1)
            {
                for (int j = 0; j < data.get(i).size(); j++) {
                    if (data.get(i).get(j).equals("")) {
                        System.out.print(String.format("|%-"+width.get(j)+"s", "Không có dữ liệu"));
                    } else
                        System.out.print(String.format("|%-"+width.get(j)+"s", data.get(i).get(j)));
                }
                System.out.println();
            }
            else
            {
                for(int j = 0; j < data.get(i).size(); j++)
                {
                    for(int u = 0; u < 3; u++) System.out.println(String.format("|-%"+width.get(j)+"s"," "));
                    System.out.print(String.format("|-%"+width.get(j)+"s", data.get(i).get(j)));
                }
            }

        }
    }
}