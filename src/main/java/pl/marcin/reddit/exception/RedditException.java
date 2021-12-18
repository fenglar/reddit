package pl.marcin.reddit.exception;

public class RedditException extends RuntimeException {
    public RedditException(String exMessage) {
        super(exMessage);
    }
}
