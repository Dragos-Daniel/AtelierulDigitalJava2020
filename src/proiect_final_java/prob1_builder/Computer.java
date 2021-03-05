package proiect_final_java.prob1_builder;

public class Computer {
    private String HDD;
    private String RAM;
    private String CPU;
    private String GPU;
    private boolean networkConnection;
    private boolean gamingSpec;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public boolean isNetworkConnection() {
        return networkConnection;
    }

    public boolean isGamingSpec() {
        return gamingSpec;
    }
    public void gamingTest(){
        if( gamingSpec)
            System.out.println("This pc is a gaming rig");
        else
            System.out.println("This pc is not a gaming rig");
    }
    public void netTest(){
        if( networkConnection)
            System.out.println("This pc has network connection ");
        else
            System.out.println("This pc need to have a network connection established");
    }

    private Computer(ComputerBuilder builder){
        this.HDD= builder.HDD;
        this.RAM= builder.RAM;
        this.CPU= builder.CPU;
        this.GPU= builder.GPU;
        this.networkConnection= builder.networkConnection;
        this.gamingSpec= builder.gamingSpec;

    }
    public void getDescription(){
        System.out.println("PC with: "+ getHDD() + " " + getRAM() + " "+ getCPU() + " "+ getGPU());
    }

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private String CPU;
        private String GPU;
        private boolean networkConnection;
        private boolean gamingSpec;


        public ComputerBuilder(String HDD, String RAM, String CPU, String GPU) {
            this.HDD = HDD;
            this.RAM = RAM;
            this.CPU = CPU;
            this.GPU = GPU;
        }

        public void setHDD(String HDD) {
            this.HDD = HDD;
        }

        public ComputerBuilder setNetworkConnection(boolean networkConnection) {
            this.networkConnection = networkConnection;
            return this;
        }

        public ComputerBuilder setGamingSpec(boolean gamingSpec) {
            this.gamingSpec = gamingSpec;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}


