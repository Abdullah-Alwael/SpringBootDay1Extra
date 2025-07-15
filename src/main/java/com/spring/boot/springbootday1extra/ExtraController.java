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
        return "<h1>Science Fiction explores speculative concepts rooted in science and technology, often set in " +
                "the future or on other planets. Themes frequently include artificial intelligence, " +
                "space travel, dystopian societies, time travel, and the impact of advanced technology on humanity.</h1>" +
                "<br>Books:" +
                "<br>1) Dune by Frank Herbert" +
                "<br>2) 1984 by George Orwell" +
                "<br>3) The Martian by Andy Weir" +
                "<br>4) Neuromancer by William Gibson" +
                "<br>5) Foundation by Isaac Asimov";
    }

    @GetMapping("/mystery")
    public String mystery(){
        return "<h1>Mystery novels center around a crime or a perplexing puzzle that a protagonist, " +
                "often a detective, must solve. They are characterized by suspense, red herrings, clues, " +
                "and a gradual revelation of information leading to a final solution or unmasking of the culprit.</h1>" +
                "<br>Books:" +
                "<br>1) And Then There Were None by Agatha Christie" +
                "<br>2) The Girl with the Dragon Tattoo by Stieg Larsson" +
                "<br>3) The Da Vinci Code by Dan Brown" +
                "<br>4) Gone Girl by Gillian Flynn" +
                "<br>5) The Silent Patient by Alex Michaelides";
    }

    @GetMapping("/thriller")
    public String thriller(){
        return "<h1>Thrillers are designed to evoke strong feelings of excitement, suspense, and anxiety in the reader." +
                " They typically involve high stakes, fast-paced plots, unexpected twists, and often a protagonist " +
                "in peril who must overcome significant obstacles, frequently against a ticking clock.</h1>" +
                "<br>Books:" +
                "<br>1) The Silence of the Lambs by Thomas Harris" +
                "<br>2) The Guest List by Lucy Fokley" +
                "<br>3) The Woman in Cabin 10 by Ruth Ware" +
                "<br>4) Before I Go to Sleep by S.J. Watson" +
                "<br>5) The Chain by Adrian McKinty";
    }

    @GetMapping("/romance")
    public String romance(){
        return "<h1>Romance novels focus on the development of a romantic relationship between two or more characters. " +
                "A key element is an emotionally satisfying and optimistic ending, even if there are obstacles " +
                "and conflicts along the way. Subgenres can include historical, contemporary, paranormal, and more.</h1>" +
                "<br>Books:" +
                "<br>1) Pride and Prejudice by Jane Austen" +
                "<br>2) The Notebook by Nicholas Sparks" +
                "<br>3) Red, White & Royal Blue by Casey McQuiston" +
                "<br>4) The Love Hypothesis by Ali Hazelwood" +
                "<br>5) It Ends With Us by Colleen Hoover";
    }

    @GetMapping("/historical-fiction")
    public String historicalFiction(){
        return "<h1>Historical fiction books are set in a specific period of the past, often incorporating real" +
                " historical events, figures, or social conditions. While the characters and specific plot" +
                " may be fictional, the setting and cultural details are researched to provide an authentic" +
                " portrayal of the era.</h1>" +
                "<br>Books:" +
                "<br>1) The Nightingale by Kristin Hannah" +
                "<br>2) A Tale of Two Cities by Charles Dickens" +
                "<br>3) The Pillars of the Earth by Ken Follett" +
                "<br>4) The Book Thief by Markus Zusak" +
                "<br>5) Circe by Madeline Miller";
    }

    @GetMapping("/horror")
    public String horror(){
        return "<h1>Horror aims to frighten, disturb, and evoke feelings of dread in the reader." +
                " It often features supernatural elements, psychological terror, monsters, or extreme violence," +
                " exploring humanity's deepest fears and anxieties.</h1>" +
                "<br>Books:" +
                "<br>1) It by Stephen King" +
                "<br>2) Frankenstein by Mary Shelley" +
                "<br>3) Dracula by Bram Stoker" +
                "<br>4) The Haunting of Hill House by Shirley Jackson" +
                "<br>5) Mexican Gothic by Silvia Moreno-Garcia";
    }

    @GetMapping("/young-adult")
    public String youngAdult(){
        return "<h1>Young Adult literature is written for an audience typically aged 12 to 18. " +
                "It often deals with coming-of-age themes, identity, first love, friendship, " +
                "and navigating the challenges of adolescence, spanning various genres like fantasy, " +
                "contemporary, and dystopian.</h1>" +
                "<br>Books:" +
                "<br>1) The Hunger Games by Suzanne Collins" +
                "<br>2) The Fault in Our Stars by John Green" +
                "<br>3) Divergent by Veronica Roth" +
                "<br>4) Twilight by Stephenie Meyer" +
                "<br>5) Six of Crows by Leigh Bardugo";
    }

    @GetMapping("/childrens-literature")
    public String childrenLiterature(){
        return "<h1>Children's literature encompasses books written for young readers, " +
                "typically from infancy through early adolescence. These books often feature simple language," +
                " engaging stories, colorful illustrations, and aim to entertain, educate, " +
                "and impart moral lessons suitable for their developmental stage.</h1>" +
                "<br>Books:" +
                "<br>1) Charlotte's Web by E.B. White" +
                "<br>2) Matilda by Roald Dahl" +
                "<br>3) Where the Wild Things Are by Maurice Sendak" +
                "<br>4) The Lion, the Witch and the Wardrobe by C.S. Lewis" +
                "<br>5) Goodnight Moon by Margaret Wise Brown";
    }

    @GetMapping("/biography")
    public String biography(){
        return "<h1>Biographies are non-fiction accounts of a person's life, " +
                "written by someone else. Memoirs are autobiographical accounts written by the person themselves," +
                " usually focusing on a specific period, theme, or series of events in their life" +
                " rather than their entire life story.</h1>" +
                "<br>Books:" +
                "<br>1) Educated by Tara Westover" +
                "<br>2) The Diary of a Young Girl by Anne Frank" +
                "<br>3) Becoming by Michelle Obama" +
                "<br>4) I Know Why the Caged Bird Sings by Maya Angelou" +
                "<br>5) Steve Jobs by Walter Isaacson";
    }

    @GetMapping("/personal-development")
    public String personalDevelopment(){
        return "<h1>These non-fiction books offer advice, strategies, and guidance to help readers improve " +
                "various aspects of their lives, such as relationships, career, finances, mental health, " +
                "or personal habits. They often provide actionable steps and motivational insights.</h1>" +
                "<br>Books:" +
                "<br>1) Atomic Habits by James Clear" +
                "<br>2) The 7 Habits of Highly Effective People by Stephen Covey" +
                "<br>3) Daring Greatly by Brené Brown" +
                "<br>4) Think and Grow Rich by Napoleon Hill" +
                "<br>5) The Subtle Art of Not \"caring\"* by Mark Manson";
    }

    @GetMapping("/classics")
    public String classics(){
        return "<h1>Classic literature refers to books that have stood the test of time, " +
                "demonstrating enduring literary merit and cultural significance. " +
                "They often explore universal themes, have influenced subsequent literature, " +
                "and are widely studied and admired across generations.</h1>" +
                "<br>Books:" +
                "<br>1) To Kill a Mockingbird by Harper Lee" +
                "<br>2) The Great Gatsby by F. Scott Fitzgerald" +
                "<br>3) Moby Dick by Herman Melville" +
                "<br>4) Jane Eyre by Charlotte Brontë" +
                "<br>5) Crime and Punishment by Fyodor Dostoevsky";
    }

    @GetMapping("/non-fiction")
    public String nonFiction(){
        return "<h1>This broad category includes factual books that provide information, " +
                "analysis, or arguments about real-world topics. This can range from detailed historical accounts," +
                " scientific explanations, journalistic investigations, travelogues, " +
                "and essays on a wide array of subjects.</h1>" +
                "<br>Books:" +
                "<br>1) Sapiens: A Brief History of Humankind by Yuval Noah Harari" +
                "<br>2) Cosmos by Carl Sagan" +
                "<br>3) A Brief History of Time by Stephen Hawking" +
                "<br>4) Into Thin Air by Jon Krakauer" +
                "<br>5) The Immortal Life of Henrietta Lacks by Rebecca Skloot";
    }

    @GetMapping("/novels-and-comics")
    public String novelsAndComics(){
        return "<h1>Graphic novels and comics tell stories primarily through sequential art, " +
                "combining illustrations with text. They can span all genres and often feature complex narratives," +
                " sophisticated artwork, and are distinct from traditional comic strips in their length" +
                " and often more mature themes.</h1>" +
                "<br>Books:" +
                "<br>1) Maus by Art Spiegelman" +
                "<br>2) Persepolis by Marjane Satrapi" +
                "<br>3) Watchmen by Alan Moore and Dave Gibbons" +
                "<br>4) Saga, Vol. 1 by Brian K. Vaughan and Fiona Staples" +
                "<br>5) Fun Home by Alison Bechdel";
    }

    @GetMapping("/poetry")
    public String poetry(){
        return "<h1>Poetry is a form of literature that uses aesthetic and rhythmic qualities of language" +
                " such as phonaesthetics, sound symbolism, and metre to evoke meanings in addition to, " +
                "or in place of, prosaic ostensible meaning. It often explores emotions, experiences, " +
                "and ideas in a concise and evocative manner.</h1>" +
                "<br>Books:" +
                "<br>1) The Waste Land by T.S. Eliot" +
                "<br>2) Leaves of Grass by Walt Whitman" +
                "<br>3) Selected Poems by Emily Dickinson" +
                "<br>4) Milk and Honey by Rupi Kaur" +
                "<br>5) Where the Sidewalk Ends by Shel Silverstein";
    }
}
