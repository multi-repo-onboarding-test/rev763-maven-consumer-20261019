package example;

/** Synthetic consumer; no credentials or real authorization are used. */
public final class AccessGateway {
    private final AccessClient client = new AccessClient();

    public boolean allow(String token) {
        return token != null && token.trim().length() >= 6;
    }
}
