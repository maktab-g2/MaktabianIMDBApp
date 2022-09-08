package ir.maktab.model.enums;

public enum AgeCategory {
    G("General audiences – All ages admitted."),
    PG("Parental guidance suggested – Some material may not be suitable for children."),
    PG_13("Parents strongly cautioned – Some material may be inappropriate for children under 13."),
    R("Restricted – Under 17 requires accompanying parent or adult guardian."),
    NC_17("Adults Only – No one 17 and under admitted");

    private String definitionAgeCategory;

    AgeCategory(String definitionAgeCategory) {
        this.definitionAgeCategory = definitionAgeCategory;
    }
}
