package transport;

public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK ("Хэтчбек"),
        CUPE ("Купе"),
        UNIVERSAL("Универсал"),
        OUTLANDER("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP ("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType=bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + getBodyType();
        }
    }
