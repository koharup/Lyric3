package app.sano.picchi.lyricmemo;

import io.realm.RealmObject;

public class Memo extends RealmObject {

    //タイトル
    public String title;
    //日付
    public String updateDate;
    //内容
    public String content;
    //歌詞1
    public String word1;
    //歌詞２
    public String word2;
}
