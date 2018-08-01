package pl.akademiakodu.bmiCalc.model;

public class Value {
    int weight;
    float height;
    public int getWeight() {return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }
    public float getInd(){
        float ind;
        ind=weight/(height*height);
        return ind;
   }
  public String info(){
        float x;
      x=weight/(height*height);
        if(x<16){
            return "wygłodnienie"; }
        else if(x>=16 && x<17){
            return "wychudzenie"; }
        else if (x>=17 && x<18.49){
            return "niedowaga"; }
        else if (x>=18.50 && x<24.99){
            return "wartość prawidłowa"; }
        else if (x>=25.00 && x<29.99){
            return "nadwaga"; }
        else if (x>=30 && x<34.99){
            return "pierwszy stopień otyłości"; }
        else if (x>=35 && x<39.99){
            return "drugi stopień otyłości"; }
        else return "trzeci stopień otyłośći";
    }



Value(){};
    @Override
    public String toString() {
        return "Value{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}
