package curso.projeto.postProjeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class principal {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("How that's awesome!");

        Post post = new Post(
                sdf.parse("17/12/2007 19:30:20"),
                "Traveling to new zeland",
                "Im going visit this wonderful contry!",
                12
        );

        post.addComent(c1);
        post.addComent(c2);

        System.out.println(post);


    }
}
