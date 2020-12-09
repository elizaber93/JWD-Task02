package by.epam.training.javaWEB.task02.dto;

public abstract class Appliance implements IAppliance {
    @Override
    abstract public void setParameters();

    @Override
    public void seeParameters() {
        System.out.println(this);
    }

}
