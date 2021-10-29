public enum VowelsEnum {
    a('a'), 
    e('e'), 
    i('i'), 
    o('o'), 
    u('u');

    private final char charValue;
    
    /**
     * 
     * @param charValue
     */
    VowelsEnum(char charValue) {
        this.charValue = charValue;
    }
    /**
     * 
     * @return
     */
    public char charValue() {
        return charValue;
    }
    
    
}