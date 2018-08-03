package pl.akademiakodu.bmiCalc.model;

public class Bmr {

    float sex;
    int weight;
    float index;

    public float getSex() {
        return sex;
    }

    public void setSex(float sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getIndex() {
        return index;
    }

    public void setIndex(float index) {
        this.index = index;
    }

    public float bmrIndex() {
        float bmp;
        bmp = weight * index * sex * (24);
        return bmp;
    }

    public Bmr(float sex, int weight, float index) {
        this.sex = sex;
        this.weight = weight;
        this.index = index;
    }

    public Bmr() {
    }

    @Override
    public String toString() {
        return "Bmr{" +
                "sex=" + sex +
                ", weight=" + weight +
                ", index=" + index +
                '}';
    }
}
