package dz07;


public class Plate
{
    private int amountOfFood;

    Plate(int amountOfFood)
    {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString()
    {
        return "Еда в тарелке: " + amountOfFood;
    }

    void decreaseFood(int appetite) // Метод decreaseFood() уменьшает еду на  величину appetite кота
    {
        if (amountOfFood >= appetite) // Кот ест, если в тарелке еды больше, чем его аппетит
        {
            amountOfFood -= appetite; // Еда в тарелке уменьшается на величину аппетита кота
        }
    }

    int getAmountOfFood()
    {
        return amountOfFood;
    }


}

