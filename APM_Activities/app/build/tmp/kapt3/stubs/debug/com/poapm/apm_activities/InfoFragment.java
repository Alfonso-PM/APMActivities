package com.poapm.apm_activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u001a\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u0011H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/poapm/apm_activities/InfoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "FAVORITE_IMAGE", "", "FAVORITE_SOUND", "PREFS", "clImageInfo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "image", "Lcom/poapm/apm_activities/Image;", "infotxt", "Landroid/widget/TextView;", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "myId", "", "myImagen", "Landroid/widget/ImageView;", "onof", "", "preferences", "Landroid/content/SharedPreferences;", "song", "star", "ShowFull", "", "contador2", "btnstar", "conta", "getImage", "initView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playSound", "sound", "saveImage", "showImg", "app_debug"})
public final class InfoFragment extends androidx.fragment.app.Fragment {
    private android.widget.ImageView myImagen;
    private androidx.constraintlayout.widget.ConstraintLayout clImageInfo;
    private android.widget.TextView infotxt;
    private android.widget.ImageView star;
    private android.widget.ImageView song;
    private boolean onof = false;
    private int myId = 0;
    private com.poapm.apm_activities.Image image;
    private final java.lang.String PREFS = "PREFS";
    private final java.lang.String FAVORITE_IMAGE = "FAVORITE_IMAGE";
    private final java.lang.String FAVORITE_SOUND = "FAVORITE_SOUND";
    private android.content.SharedPreferences preferences;
    private final com.squareup.moshi.Moshi moshi = null;
    
    public InfoFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void showImg(int conta) {
    }
    
    private final void playSound(int sound) {
    }
    
    private final void ShowFull(int contador2) {
    }
    
    private final void btnstar(int conta) {
    }
    
    private final void saveImage(com.poapm.apm_activities.Image image) {
    }
    
    private final com.poapm.apm_activities.Image getImage() {
        return null;
    }
}