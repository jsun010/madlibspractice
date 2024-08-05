public class Madlib {
    private String story="Once upon a time, there was a (ADJECTIVE) person who was really good at (NOUN). She was so (ADJECTIVE+LY) good because she had the best unit in the game, Leona. The end.";
    private String segment1="Once upon a time, there was a ";
    private String segment2="person who was really good at";
    private StringBuffer segment3=new StringBuffer();
    private StringBuilder segment4=new StringBuilder();
    private String segment5="";
    private StringBuffer segment6=new StringBuffer();
    public Madlib(){
        System.out.println(story);
    }

    public void update1 (String input){
        segment3.append(segment1+input+" "+segment2);
        System.out.println(segment3+" (NOUN). She was so (ADJECTIVE+LY) good because she had the best unit in the game, Leona. She was also (ADJECTVIE+LY) good at everything else she did too. The end.");
    }

    public void update2(String input){
        segment4.append(segment3+" "+input+""+". She was so");
        System.out.println(segment4+" (ADJECTIVE+LY) good because she had the best unit in the game, Leona. She was also (ADJECTVIE+LY) good at everything else she did too. The end.");
    }

    public void update3(String input){
        segment5=segment4+" "+input+"ly"+" good because she had the best unit in the game, Leona. She was also ";
        System.out.println(segment5+"(ADJECTVIE+LY) good at everything else she did too. The end.");
    }

    public void update4(String input){
        segment6.append(segment5+input+"ly"+" good at everything else she did too. The end.");
        System.out.println(segment6);
    }


}
