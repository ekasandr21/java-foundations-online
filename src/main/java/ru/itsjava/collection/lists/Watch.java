package ru.itsjava.collection.lists;

public class Watch {

        private final String firm;
        private String author;
        private double price;

        public Watch(String firm, String author, double price) {
                this.firm = firm;
                this.author = author;
                this.price = price;
        }

        public String getFirm() {
                return this.firm;
        }

        public String getAuthor() {
                return this.author;
        }

        public double getPrice() {
                return this.price;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public boolean equals(final Object o) {
                if (o == this) return true;
                if (!(o instanceof Watch)) return false;
                final Watch other = (Watch) o;
                if (!other.canEqual((Object) this)) return false;
                final Object this$firm = this.getFirm();
                final Object other$firm = other.getFirm();
                if (this$firm == null ? other$firm != null : !this$firm.equals(other$firm)) return false;
                final Object this$author = this.getAuthor();
                final Object other$author = other.getAuthor();
                if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
                if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
                return true;
        }

        protected boolean canEqual(final Object other) {
                return other instanceof Watch;
        }

        public int hashCode() {
                final int PRIME = 59;
                int result = 1;
                final Object $firm = this.getFirm();
                result = result * PRIME + ($firm == null ? 43 : $firm.hashCode());
                final Object $author = this.getAuthor();
                result = result * PRIME + ($author == null ? 43 : $author.hashCode());
                final long $price = Double.doubleToLongBits(this.getPrice());
                result = result * PRIME + (int) ($price >>> 32 ^ $price);
                return result;
        }

        public String toString() {
                return "Watch(firm=" + this.getFirm() + ", author=" + this.getAuthor() + ", price=" + this.getPrice() + ")";
        }
}
