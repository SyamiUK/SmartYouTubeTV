package com.liskovsoft.smartyoutubetv.flavors.exoplayer.youtubeinfoparser.main;

import android.net.Uri;
import com.liskovsoft.smartyoutubetv.flavors.exoplayer.youtubeinfoparser.main.YouTubeMediaParser.GenericInfo;

import java.io.InputStream;

public abstract class YouTubeInfoVisitor {
    public void onMediaItem(YouTubeMediaParser.MediaItem mediaItem){}
    public void onSubItem(YouTubeSubParser.Subtitle mediaItem){}
    public void onHlsUrl(Uri url) {}
    public void doneVisiting(){}
    public void onGenericInfo(GenericInfo info){}
    public void onDashUrl(Uri url) {}
    public void onTrackingUrl(Uri url) {}
}
