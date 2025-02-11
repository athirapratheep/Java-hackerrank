import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Document> docList = new ArrayList<>();

       
        while (sc.hasNextInt()) { 
            int id = sc.nextInt();
            sc.nextLine(); 

            if (!sc.hasNextLine()) break;
            String title = sc.nextLine();

            if (!sc.hasNextLine()) break;
            String folderName = sc.nextLine();
            
            if (!sc.hasNextInt()) break;
            int pages = sc.nextInt();
            sc.nextLine(); 

            docList.add(new Document(id, title, folderName, pages));
        }
        sc.close(); 
        Document[] doc = docList.toArray(new Document[0]);

        Document[] oddPageDocs = docsWithOddPages(doc);
        for (Document d : oddPageDocs) {
            System.out.println(d.getId() + " | " + d.getTitle() + " | " + d.getFolderName() + " | " + d.getPages() + " pages");
        }
    }

    public static Document[] docsWithOddPages(Document[] doc) {
        List<Document> result = new ArrayList<>();
        for (Document d : doc) {
            if (d.getPages() % 2 != 0) {
                result.add(d);
            }
        }
        return result.toArray(new Document[0]); 
    }
}

class Document {
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFolderName() {
        return folderName;
    }

    public int getPages() {
        return pages;
    }
}
