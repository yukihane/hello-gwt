package example.gwt.client;

public final class Cipher {

    private Cipher() {
    }

    /**
     * 指定された文字列のハッシュ値(16進)を返します
     * 
     * @param src
     *            対象文字列
     * @return ハッシュ値
     */
    public static native String toMD5Hexhash(final String src)
    /*-{
        return $wnd.MD5_hexhash(src);
    }-*/;

}
