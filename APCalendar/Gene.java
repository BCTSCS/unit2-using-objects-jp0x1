public class Gene {
    private String dna;
    private int geneCount;

    public Gene (String dna){
        this.dna = dna;
        this.geneCount = 0;
    }
    public int countNucleotides(String genetic, char nucleotide) {
        int count = 0;
        for (int i = 0; i < genetic.length(); i++){
            if (g.charAt(i) == nucleotide) {
                count++;
            }
        }
        return count;
    }
    public String findGenes(String dna, int startIndex) {
        int startCodon = dna.indexOf("ATG", startIndex);
        if (start == -1) {
            return 
        }
        for (int i = start + 3;i < dna.length() -2; i +=3){
            String codon = dna.substring(i, i+3);
            if (codon.equals("TAA") || codon.equals("TAG") || codon.equals("TGA")) {
                return dna.substring(start, i+3);
            }
        }

    }
    public boolean potentialGene(String dna){
        if (!dna.startsWith("ATG")) {
            return false;
        } 
        if (dna.length() % 3 != 0) {
            return false;
        }
        
        String dnaEnd = dna.substring(dna.length() - 3);
        
        if (!dnaEnd.equals("TAA") || !dnaEnd.equals("TAG") || !dnaEnd.equals("TGA")){
            return false
        } 
        return true;

    }
    
}