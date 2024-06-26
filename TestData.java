public class TestData {
        public static void loadItems(Library library) {
                // Create authors
                Author author1 = new Author("J.K. Rowling", "1965-07-31");
                Author author2 = new Author("George R.R. Martin", "1948-09-20");
                Author author3 = new Author("Stephen King", "1947-09-21");
                Author author4 = new Author("Agatha Christie", "1890-09-15");
                Author author5 = new Author("J.R.R. Tolkien", "1892-01-03");
                Author author6 = new Author("Mark Twain", "1835-11-30");
                Author author7 = new Author("Ernest Hemingway", "1899-07-21");
                Author author8 = new Author("Jane Austen", "1775-12-16");
                Author author9 = new Author("Charles Dickens", "1812-02-07");
                Author author10 = new Author("F. Scott Fitzgerald", "1896-09-24");

                // Add authors to library
                library.addAuthor(author1);
                library.addAuthor(author2);
                library.addAuthor(author3);
                library.addAuthor(author4);
                library.addAuthor(author5);
                library.addAuthor(author6);
                library.addAuthor(author7);
                library.addAuthor(author8);
                library.addAuthor(author9);
                library.addAuthor(author10);

                // Create and add Printed Periodicals
                PeriodicalPrinted printedPeriodical1 = new PeriodicalPrinted(
                                "P001", "The New Yorker", author1, "9781234567890", "Condé Nast",
                                10, "January 2022", "2022-01-01", "Monthly", 120);
                PeriodicalPrinted printedPeriodical2 = new PeriodicalPrinted(
                                "P002", "National Geographic", author2, "9781234567891", "National Geographic Partners",
                                12, "February 2022", "2022-02-01", "Monthly", 100);
                PeriodicalPrinted printedPeriodical3 = new PeriodicalPrinted(
                                "P003", "Time", author3, "9781234567892", "Time USA, LLC",
                                8, "March 2022", "2022-03-01", "Weekly", 90);
                PeriodicalPrinted printedPeriodical4 = new PeriodicalPrinted(
                                "P004", "Forbes", author4, "9781234567896", "Forbes Media",
                                7, "April 2022", "2022-04-01", "Monthly", 110);
                PeriodicalPrinted printedPeriodical5 = new PeriodicalPrinted(
                                "P005", "The Economist", author5, "9781234567897", "The Economist Group",
                                6, "May 2022", "2022-05-01", "Weekly", 130);
                PeriodicalPrinted printedPeriodical6 = new PeriodicalPrinted(
                                "P006", "Scientific American", author6, "9781234567898", "Springer Nature",
                                5, "June 2022", "2022-06-01", "Monthly", 140);
                PeriodicalPrinted printedPeriodical7 = new PeriodicalPrinted(
                                "P007", "Harvard Business Review", author7, "9781234567899",
                                "Harvard Business Publishing",
                                4, "July 2022", "2022-07-01", "Monthly", 100);
                PeriodicalPrinted printedPeriodical8 = new PeriodicalPrinted(
                                "P008", "Nature", author8, "9781234567800", "Springer Nature",
                                9, "August 2022", "2022-08-01", "Weekly", 115);
                PeriodicalPrinted printedPeriodical9 = new PeriodicalPrinted(
                                "P009", "The Atlantic", author9, "9781234567801", "The Atlantic Monthly Group",
                                11, "September 2022", "2022-09-01", "Monthly", 125);
                PeriodicalPrinted printedPeriodical10 = new PeriodicalPrinted(
                                "P010", "Popular Science", author10, "9781234567802", "Bonnier Corporation",
                                13, "October 2022", "2022-10-01", "Bi-Monthly", 135);
                library.addItem(printedPeriodical1);
                library.addItem(printedPeriodical2);
                library.addItem(printedPeriodical3);
                library.addItem(printedPeriodical4);
                library.addItem(printedPeriodical5);
                library.addItem(printedPeriodical6);
                library.addItem(printedPeriodical7);
                library.addItem(printedPeriodical8);
                library.addItem(printedPeriodical9);
                library.addItem(printedPeriodical10);

                // Create and add Electronic Periodicals
                PeriodicalElectronic electronicPeriodical1 = new PeriodicalElectronic(
                                "P011", "Wired", author1, "9781234567893", "Condé Nast",
                                5, "April 2022", "2022-04-01", "Monthly", "www.wired.com");
                PeriodicalElectronic electronicPeriodical2 = new PeriodicalElectronic(
                                "P012", "Scientific American", author2, "9781234567894", "Springer Nature",
                                6, "May 2022", "2022-05-01", "Monthly", "www.scientificamerican.com");
                PeriodicalElectronic electronicPeriodical3 = new PeriodicalElectronic(
                                "P013", "The Verge", author3, "9781234567895", "Vox Media",
                                7, "June 2022", "2022-06-01", "Weekly", "www.theverge.com");
                PeriodicalElectronic electronicPeriodical4 = new PeriodicalElectronic(
                                "P014", "TechCrunch", author4, "9781234567896", "Verizon Media",
                                5, "April 2022", "2022-04-01", "Daily", "www.techcrunch.com");
                PeriodicalElectronic electronicPeriodical5 = new PeriodicalElectronic(
                                "P015", "Mashable", author5, "9781234567897", "Ziff Davis",
                                6, "May 2022", "2022-05-01", "Weekly", "www.mashable.com");
                PeriodicalElectronic electronicPeriodical6 = new PeriodicalElectronic(
                                "P016", "Ars Technica", author6, "9781234567898", "Condé Nast",
                                7, "June 2022", "2022-06-01", "Monthly", "www.arstechnica.com");
                PeriodicalElectronic electronicPeriodical7 = new PeriodicalElectronic(
                                "P017", "Gizmodo", author7, "9781234567899", "G/O Media",
                                8, "July 2022", "2022-07-01", "Weekly", "www.gizmodo.com");
                PeriodicalElectronic electronicPeriodical8 = new PeriodicalElectronic(
                                "P018", "Engadget", author8, "9781234567800", "Verizon Media",
                                9, "August 2022", "2022-08-01", "Daily", "www.engadget.com");
                PeriodicalElectronic electronicPeriodical9 = new PeriodicalElectronic(
                                "P019", "Recode", author9, "9781234567801", "Vox Media",
                                10, "September 2022", "2022-09-01", "Weekly", "www.recode.net");
                PeriodicalElectronic electronicPeriodical10 = new PeriodicalElectronic(
                                "P020", "ZDNet", author10, "9781234567802", "Red Ventures",
                                11, "October 2022", "2022-10-01", "Daily", "www.zdnet.com");
                library.addItem(electronicPeriodical1);
                library.addItem(electronicPeriodical2);
                library.addItem(electronicPeriodical3);
                library.addItem(electronicPeriodical4);
                library.addItem(electronicPeriodical5);
                library.addItem(electronicPeriodical6);
                library.addItem(electronicPeriodical7);
                library.addItem(electronicPeriodical8);
                library.addItem(electronicPeriodical9);
                library.addItem(electronicPeriodical10);

                // Create and add Printed Books
                BookPrinted printedBook1 = new BookPrinted(
                                "B001", "Harry Potter and the Philosopher's Stone", author1, "9780747532743",
                                "Bloomsbury",
                                15, "First", "Fantasy", 223, true);
                BookPrinted printedBook2 = new BookPrinted(
                                "B002", "A Game of Thrones", author2, "9780553103540", "Bantam Spectra",
                                10, "First", "Fantasy", 694, true);
                BookPrinted printedBook3 = new BookPrinted(
                                "B003", "The Shining", author3, "9780385121675", "Doubleday",
                                8, "First", "Horror", 447, true);
                BookPrinted printedBook4 = new BookPrinted(
                                "B004", "Murder on the Orient Express", author4, "9780007119318", "Collins Crime Club",
                                7, "First", "Mystery", 256, true);
                BookPrinted printedBook5 = new BookPrinted(
                                "B005", "The Hobbit", author5, "9780261102217", "George Allen & Unwin",
                                9, "First", "Fantasy", 310, true);
                BookPrinted printedBook6 = new BookPrinted(
                                "B006", "The Adventures of Tom Sawyer", author6, "9780486400778",
                                "American Publishing Company",
                                6, "First", "Adventure", 274, true);
                BookPrinted printedBook7 = new BookPrinted(
                                "B007", "The Old Man and the Sea", author7, "9780684801223", "Charles Scribner's Sons",
                                5, "First", "Literary Fiction", 127, true);
                BookPrinted printedBook8 = new BookPrinted(
                                "B008", "Pride and Prejudice", author8, "9780141040349", "T. Egerton",
                                12, "First", "Romance", 279, true);
                BookPrinted printedBook9 = new BookPrinted(
                                "B009", "A Tale of Two Cities", author9, "9781853260391", "Chapman & Hall",
                                11, "First", "Historical Fiction", 341, true);
                BookPrinted printedBook10 = new BookPrinted(
                                "B010", "The Great Gatsby", author10, "9780743273565", "Charles Scribner's Sons",
                                13, "First", "Tragedy", 180, true);
                library.addItem(printedBook1);
                library.addItem(printedBook2);
                library.addItem(printedBook3);
                library.addItem(printedBook4);
                library.addItem(printedBook5);
                library.addItem(printedBook6);
                library.addItem(printedBook7);
                library.addItem(printedBook8);
                library.addItem(printedBook9);
                library.addItem(printedBook10);

                // Create and add Electronic Books
                BookElectronic electronicBook1 = new BookElectronic(
                                "B011", "Harry Potter and the Chamber of Secrets", author1, "9780747538493",
                                "Bloomsbury",
                                12, "Second", "Fantasy", true, "www.harrypotter.com");
                BookElectronic electronicBook2 = new BookElectronic(
                                "B012", "A Clash of Kings", author2, "9780553108033", "Bantam Spectra",
                                9, "First", "Fantasy", true, "www.gameofthrones.com");
                BookElectronic electronicBook3 = new BookElectronic(
                                "B013", "It", author3, "9780670813025", "Viking",
                                7, "First", "Horror", true, "www.stephenking.com");
                BookElectronic electronicBook4 = new BookElectronic(
                                "B014", "And Then There Were None", author4, "9780062073488", "Collins Crime Club",
                                6, "First", "Mystery", true, "www.agathachristie.com");
                BookElectronic electronicBook5 = new BookElectronic(
                                "B015", "The Lord of the Rings", author5, "9780261102385", "George Allen & Unwin",
                                10, "First", "Fantasy", true, "www.tolkien.co.uk");
                BookElectronic electronicBook6 = new BookElectronic(
                                "B016", "Adventures of Huckleberry Finn", author6, "9780486280615",
                                "American Publishing Company",
                                5, "First", "Adventure", true, "www.marktwainhouse.org");
                BookElectronic electronicBook7 = new BookElectronic(
                                "B017", "A Farewell to Arms", author7, "9780684801469", "Charles Scribner's Sons",
                                4, "First", "Literary Fiction", true, "www.ernesthemingway.com");
                BookElectronic electronicBook8 = new BookElectronic(
                                "B018", "Sense and Sensibility", author8, "9780141040370", "T. Egerton",
                                11, "First", "Romance", true, "www.janeausten.org");
                BookElectronic electronicBook9 = new BookElectronic(
                                "B019", "Great Expectations", author9, "9781853260049", "Chapman & Hall",
                                8, "First", "Historical Fiction", true, "www.charlesdickenspage.com");
                BookElectronic electronicBook10 = new BookElectronic(
                                "B020", "Tender Is the Night", author10, "9780684801544", "Charles Scribner's Sons",
                                13, "First", "Tragedy", true, "www.fscottfitzgerald.com");
                library.addItem(electronicBook1);
                library.addItem(electronicBook2);
                library.addItem(electronicBook3);
                library.addItem(electronicBook4);
                library.addItem(electronicBook5);
                library.addItem(electronicBook6);
                library.addItem(electronicBook7);
                library.addItem(electronicBook8);
                library.addItem(electronicBook9);
                library.addItem(electronicBook10);

                // Create and add Audio Books
                BookAudio audioBook1 = new BookAudio(
                                "B021", "Harry Potter and the Prisoner of Azkaban", author1, "9780747546290",
                                "Bloomsbury",
                                10, "First", "Fantasy", true, 12.5, "Stephen Fry");
                BookAudio audioBook2 = new BookAudio(
                                "B022", "A Storm of Swords", author2, "9780553573428", "Bantam Spectra",
                                6, "First", "Fantasy", true, 48.0, "Roy Dotrice");
                BookAudio audioBook3 = new BookAudio(
                                "B023", "Misery", author3, "9780670813650", "Viking",
                                5, "First", "Horror", true, 14.5, "Lindsay Crouse");
                BookAudio audioBook4 = new BookAudio(
                                "B024", "The Murder of Roger Ackroyd", author4, "9780007136834", "Collins Crime Club",
                                4, "First", "Mystery", true, 13.5, "Hugh Fraser");
                BookAudio audioBook5 = new BookAudio(
                                "B025", "The Fellowship of the Ring", author5, "9780261102354", "George Allen & Unwin",
                                9, "First", "Fantasy", true, 19.5, "Rob Inglis");
                BookAudio audioBook6 = new BookAudio(
                                "B026", "The Adventures of Tom Sawyer", author6, "9780553211603",
                                "American Publishing Company",
                                6, "First", "Adventure", true, 7.5, "William Dufris");
                BookAudio audioBook7 = new BookAudio(
                                "B027", "For Whom the Bell Tolls", author7, "9780684803357", "Charles Scribner's Sons",
                                5, "First", "Literary Fiction", true, 16.5, "Campbell Scott");
                BookAudio audioBook8 = new BookAudio(
                                "B028", "Emma", author8, "9780141199528", "T. Egerton",
                                7, "First", "Romance", true, 14.0, "Juliet Stevenson");
                BookAudio audioBook9 = new BookAudio(
                                "B029", "David Copperfield", author9, "9781853260247", "Chapman & Hall",
                                8, "First", "Historical Fiction", true, 36.5, "Martin Jarvis");
                BookAudio audioBook10 = new BookAudio(
                                "B030", "The Beautiful and Damned", author10, "9780684801483",
                                "Charles Scribner's Sons",
                                11, "First", "Tragedy", true, 17.5, "Robert Fass");
                library.addItem(audioBook1);
                library.addItem(audioBook2);
                library.addItem(audioBook3);
                library.addItem(audioBook4);
                library.addItem(audioBook5);
                library.addItem(audioBook6);
                library.addItem(audioBook7);
                library.addItem(audioBook8);
                library.addItem(audioBook9);
                library.addItem(audioBook10);

        // Create and add Audio Books
        BookAudio audioBook1 = new BookAudio(
            "B021", "Harry Potter and the Prisoner of Azkaban", author1, "9780747546290", "Bloomsbury", 
            10, "First", "Fantasy", true, 12.5, "Stephen Fry"
        );
        BookAudio audioBook2 = new BookAudio(
            "B022", "A Storm of Swords", author2, "9780553573428", "Bantam Spectra", 
            6, "First", "Fantasy", true, 48.0, "Roy Dotrice"
        );
        BookAudio audioBook3 = new BookAudio(
            "B023", "Misery", author3, "9780670813650", "Viking", 
            5, "First", "Horror", true, 14.5, "Lindsay Crouse"
        );
        BookAudio audioBook4 = new BookAudio(
            "B024", "The Murder of Roger Ackroyd", author4, "9780007136834", "Collins Crime Club", 
            4, "First", "Mystery", true, 13.5, "Hugh Fraser"
        );
        BookAudio audioBook5 = new BookAudio(
            "B025", "The Fellowship of the Ring", author5, "9780261102354", "George Allen & Unwin", 
            9, "First", "Fantasy", true, 19.5, "Rob Inglis"
        );
        BookAudio audioBook6 = new BookAudio(
            "B026", "The Adventures of Tom Sawyer", author6, "9780553211603", "American Publishing Company", 
            6, "First", "Adventure", true, 7.5, "William Dufris"
        );
        BookAudio audioBook7 = new BookAudio(
            "B027", "For Whom the Bell Tolls", author7, "9780684803357", "Charles Scribner's Sons", 
            5, "First", "Literary Fiction", true, 16.5, "Campbell Scott"
        );
        BookAudio audioBook8 = new BookAudio(
            "B028", "Emma", author8, "9780141199528", "T. Egerton", 
            7, "First", "Romance", true, 14.0, "Juliet Stevenson"
        );
        BookAudio audioBook9 = new BookAudio(
            "B029", "David Copperfield", author9, "9781853260247", "Chapman & Hall", 
            8, "First", "Historical Fiction", true, 36.5, "Martin Jarvis"
        );
        BookAudio audioBook10 = new BookAudio(
            "B030", "The Beautiful and Damned", author10, "9780684801483", "Charles Scribner's Sons", 
            11, "First", "Tragedy", true, 17.5, "Robert Fass"
        );
        library.addItem(audioBook1);
        library.addItem(audioBook2);
        library.addItem(audioBook3);
        library.addItem(audioBook4);
        library.addItem(audioBook5);
        library.addItem(audioBook6);
        library.addItem(audioBook7);
        library.addItem(audioBook8);
        library.addItem(audioBook9);
        library.addItem(audioBook10);

        // Create and add Employee Patrons
        PatronEmployee employee1 = new PatronEmployee("Alice Smith", "123 Main St", "555-1234", "Employee", "E001");
        PatronEmployee employee2 = new PatronEmployee("Bob Johnson", "456 Elm St", "555-5678", "Employee", "E002");
        PatronEmployee employee3 = new PatronEmployee("Carol Williams", "789 Oak St", "555-8765", "Employee", "E003");
        PatronEmployee employee4 = new PatronEmployee("David Brown", "101 Pine St", "555-4321", "Employee", "E004");
        PatronEmployee employee5 = new PatronEmployee("Eve Davis", "202 Maple St", "555-1357", "Employee", "E005");

        library.addPatron(employee1);
        library.addPatron(employee2);
        library.addPatron(employee3);
        library.addPatron(employee4);
        library.addPatron(employee5);

        // Create and add Student Patrons
        PatronStudent student1 = new PatronStudent("Frank Moore", "303 Birch St", "555-2468", "Student", "S001");
        PatronStudent student2 = new PatronStudent("Grace Hall", "404 Cedar St", "555-3579", "Student", "S002");
        PatronStudent student3 = new PatronStudent("Hank Adams", "505 Walnut St", "555-4680", "Student", "S003");
        PatronStudent student4 = new PatronStudent("Ivy Baker", "606 Ash St", "555-5791", "Student", "S004");
        PatronStudent student5 = new PatronStudent("Jack Carter", "707 Beech St", "555-6802", "Student", "S005");

        library.addPatron(student1);
        library.addPatron(student2);
        library.addPatron(student3);
        library.addPatron(student4);
        library.addPatron(student5);
        }
}
