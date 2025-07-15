package com.spring.boot.springbootday1extra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtraController {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome to Book Library category system</h1>" +
                "<h4>This system has the following end points to 15 categories of books</h4>" +
                "<br><a href=\"http://localhost:8080/fantasy\">1. Fantasy</a>" +
                "<br><a href=\"http://localhost:8080/science-fiction\">2. Science Fiction</a>" +
                "<br><a href=\"http://localhost:8080/mystery\">3. Mystery</a>" +
                "<br><a href=\"http://localhost:8080/thriller\">4. Thriller</a>" +
                "<br><a href=\"http://localhost:8080/romance\">5. Romance</a>" +
                "<br><a href=\"http://localhost:8080/historical-fiction\">6. Historical Fiction</a>" +
                "<br><a href=\"http://localhost:8080/horror\">7. Horror</a>" +
                "<br><a href=\"http://localhost:8080/young-adult\">8. Young Adult (YA)</a>" +
                "<br><a href=\"http://localhost:8080/childrens-literature\">9. Children's Literature</a>" +
                "<br><a href=\"http://localhost:8080/biography\">10. Biography</a>" +
                "<br><a href=\"http://localhost:8080/personal-development\">11. Personal Development</a>" +
                "<br><a href=\"http://localhost:8080/classics\">12. Classics</a>" +
                "<br><a href=\"http://localhost:8080/non-fiction\">13. Non-fiction (General/History/Science)</a>" +
                "<br><a href=\"http://localhost:8080/novels-and-comics\">14. Graphic Novel and Comics</a>" +
                "<br><a href=\"http://localhost:8080/poetry\">15. Poetry</a>";
    }

    @GetMapping("/fantasy")
    public String fantasy(){
        return "<h1>Fantasy books typically feature magical elements, mythical creatures, supernatural powers, " +
                "and often take place in entirely imagined worlds with their own unique rules, histories, and cultures." +
                " They often involve epic quests, battles between good and evil, and the development of " +
                "unique magic systems.</h1>" +
                "<br>Books:" +
                "<br>1) The Hobbit by J.R.R. Tolkien" +
                "<br>2) Harry Potter and the Sorcerer's Stone by J.K. Rowling" +
                "<br>3) A Game of Thrones by George R.R. Martin" +
                "<br>4) The Name of the Wind by Patrick Rothfuss" +
                "<br>5) Mistborn: The Final Empire by Brandon Sanderson";
    }

    @GetMapping("/science-fiction")
    public String scienceFiction(){
        return "Science Fiction explores speculative concepts rooted in science and technology, often set in " +
                "the future or on other planets. Themes frequently include artificial intelligence, " +
                "space travel, dystopian societies, time travel, and the impact of advanced technology on humanity." +
                "<br>Books:" +
                "<br>1) Dune by Frank Herbert" +
                "<br>2) 1984 by George Orwell" +
                "<br>3) The Martian by Andy Weir" +
                "<br>4) Neuromancer by William Gibson" +
                "<br>5) Foundation by Isaac Asimov";
    }

    @GetMapping("/mystery")
    public String mystery(){
        return "Mystery novels center around a crime or a perplexing puzzle that a protagonist, " +
                "often a detective, must solve. They are characterized by suspense, red herrings, clues, " +
                "and a gradual revelation of information leading to a final solution or unmasking of the culprit." +
                "<br>Books:" +
                "<br>1) And Then There Were None by Agatha Christie" +
                "<br>2) The Girl with the Dragon Tattoo by Stieg Larsson" +
                "<br>3) The Da Vinci Code by Dan Brown" +
                "<br>4) Gone Girl by Gillian Flynn" +
                "<br>5) The Silent Patient by Alex Michaelides";
    }

    @GetMapping("/thriller")
    public String thriller(){
        return "Thrillers are designed to evoke strong feelings of excitement, suspense, and anxiety in the reader." +
                " They typically involve high stakes, fast-paced plots, unexpected twists, and often a protagonist " +
                "in peril who must overcome significant obstacles, frequently against a ticking clock." +
                "<br>Books:" +
                "<br>1) The Silence of the Lambs by Thomas Harris" +
                "<br>2) The Guest List by Lucy Fokley" +
                "<br>3) The Woman in Cabin 10 by Ruth Ware" +
                "<br>4) Before I Go to Sleep by S.J. Watson" +
                "<br>5) The Chain by Adrian McKinty";
    }

    @GetMapping("/romance")
    public String romance(){
        return "Romance novels focus on the development of a romantic relationship between two or more characters. A key element is an emotionally satisfying and optimistic ending, even if there are obstacles and conflicts along the way. Subgenres can include historical, contemporary, paranormal, and more.";
    }

    @GetMapping("/historical-fiction")
    public String historicalFiction(){
        return "Historical fiction books are set in a specific period of the past, often incorporating real historical events, figures, or social conditions. While the characters and specific plot may be fictional, the setting and cultural details are researched to provide an authentic portrayal of the era.";
    }

    @GetMapping("/horror")
    public String horror(){
        return "Horror aims to frighten, disturb, and evoke feelings of dread in the reader. It often features supernatural elements, psychological terror, monsters, or extreme violence, exploring humanity's deepest fears and anxieties.";
    }

    @GetMapping("/young-adult")
    public String youngAdult(){
        return "Young Adult literature is written for an audience typically aged 12 to 18. It often deals with coming-of-age themes, identity, first love, friendship, and navigating the challenges of adolescence, spanning various genres like fantasy, contemporary, and dystopian.";
    }

    @GetMapping("/childrens-literature")
    public String childrenLiterature(){
        return "Children's literature encompasses books written for young readers, typically from infancy through early adolescence. These books often feature simple language, engaging stories, colorful illustrations, and aim to entertain, educate, and impart moral lessons suitable for their developmental stage.";
    }

    @GetMapping("/biography")
    public String biography(){
        return "Biographies are non-fiction accounts of a person's life, written by someone else. Memoirs are autobiographical accounts written by the person themselves, usually focusing on a specific period, theme, or series of events in their life rather than their entire life story.";
    }

    @GetMapping("/personal-development")
    public String personalDevelopment(){
        return "These non-fiction books offer advice, strategies, and guidance to help readers improve various aspects of their lives, such as relationships, career, finances, mental health, or personal habits. They often provide actionable steps and motivational insights.";
    }

    @GetMapping("/classics")
    public String classics(){
        return "Classic literature refers to books that have stood the test of time, demonstrating enduring literary merit and cultural significance. They often explore universal themes, have influenced subsequent literature, and are widely studied and admired across generations.";
    }

    @GetMapping("/non-fiction")
    public String nonFiction(){
        return "This broad category includes factual books that provide information, analysis, or arguments about real-world topics. This can range from detailed historical accounts, scientific explanations, journalistic investigations, travelogues, and essays on a wide array of subjects.";
    }

    @GetMapping("/novels-and-comics")
    public String novelsAndComics(){
        return "Graphic novels and comics tell stories primarily through sequential art, combining illustrations with text. They can span all genres and often feature complex narratives, sophisticated artwork, and are distinct from traditional comic strips in their length and often more mature themes.";
    }

    @GetMapping("/poetry")
    public String poetry(){
        return "Poetry is a form of literature that uses aesthetic and rhythmic qualities of language such as phonaesthetics, sound symbolism, and metre to evoke meanings in addition to, or in place of, prosaic ostensible meaning. It often explores emotions, experiences, and ideas in a concise and evocative manner.";
    }
}
