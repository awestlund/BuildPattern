

class LunchOrder{
    // inner static class
    // immutable
    // complexity

    //handles complex contructors
    // woorks with legacy code
    // can be a separate class
    // no interface needed
    public static class Builder{
        private String bread = "";
        private String meat = "";
        private String condiments = "";
        private String instructions = "";

        public Builder(){}

        public LunchOrder build() {
            return new LunchOrder(this);
        }
        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder instructions(String instructions){
            this.instructions = instructions;
            return this;
        }

    }
    private String bread;
    private String meat;
    private String condiments;
    private String instructions;

    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.meat = builder.meat;
        this.instructions = builder.instructions;
    }
    public String getBread(){
        return this.bread;
    }
    public String getMeat(){
        return this.meat;
    }
    public String getCondiments(){
        return this.condiments;
    }
    public String getInstructions(){
        return this.instructions;
    }
}