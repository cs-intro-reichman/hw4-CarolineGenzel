public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int j=0,i=0;
        int m=sentences.length;
        String [] newArr =new String[sentences.length];
       while(j<keywords.length){

        while(i<sentences.length){
            String s1=sentences[i].toLowerCase(); 
            String s2=keywords[j].toLowerCase();
            if (s1.contains(s2)) {
                newArr[i]=sentences[i];
                i++;
            }
            else i++;

                       }
        i=0;
        j++;

            } 
            for (int l = 0; l <m ; l++) {
                if (newArr[l]!=null) {
                    System.out.println(newArr[l]);
                }
            }
               
       
        }}