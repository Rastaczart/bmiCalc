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




Value(){};



    @Override
    public String toString() {
        return "Value{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}
