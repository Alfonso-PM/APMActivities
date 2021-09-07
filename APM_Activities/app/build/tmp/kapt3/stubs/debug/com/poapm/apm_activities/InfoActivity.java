package com.poapm.apm_activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/poapm/apm_activities/InfoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "IMAGE_PREFS", "", "PREFS", "image", "Lcom/poapm/apm_activities/Image;", "infotxt", "Landroid/widget/TextView;", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "myId", "", "myImagen", "Landroid/widget/ImageView;", "myImgFavorite", "onof", "", "preferences", "Landroid/content/SharedPreferences;", "star", "ShowFull", "", "contador2", "btnstar", "getImage", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveImage", "showImg", "conta", "app_debug"})
public final class InfoActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.ImageView myImagen;
    private android.widget.TextView infotxt;
    private android.widget.ImageView star;
    private boolean onof = false;
    private int myId = 0;
    private com.poapm.apm_activities.Image image;
    private com.poapm.apm_activities.Image myImgFavorite;
    private final java.lang.String PREFS = "MY_PREFERENCES";
    private final java.lang.String IMAGE_PREFS = "FAVORITE_IMAGE";
    private android.content.SharedPreferences preferences;
    private final com.squareup.moshi.Moshi moshi = null;
    
    public InfoActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveImage(com.poapm.apm_activities.Image image) {
    }
    
    private final com.poapm.apm_activities.Image getImage() {
        return null;
    }
    
    private final void initViews() {
    }
    
    private final void showImg(int conta) {
    }
    
    private final void ShowFull(int contador2) {
    }
    
    private final boolean btnstar(boolean onof) {
        return false;
    }
}