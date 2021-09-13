package com.poapm.apm_activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/poapm/apm_activities/InfoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "FAVORITE_IMAGE", "", "PREFS", "clImageInfo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "image", "Lcom/poapm/apm_activities/Image;", "infotxt", "Landroid/widget/TextView;", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "myId", "", "myImagen", "Landroid/widget/ImageView;", "myImgFavorite", "onof", "", "preferences", "Landroid/content/SharedPreferences;", "star", "ShowFull", "", "contador2", "btnstar", "conta", "getImage", "initView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "saveImage", "showImg", "app_debug"})
public final class InfoFragment extends androidx.fragment.app.Fragment {
    private android.widget.ImageView myImagen;
    private androidx.constraintlayout.widget.ConstraintLayout clImageInfo;
    private android.widget.TextView infotxt;
    private android.widget.ImageView star;
    private boolean onof = false;
    private int myId = 0;
    private com.poapm.apm_activities.Image image;
    private com.poapm.apm_activities.Image myImgFavorite;
    private final java.lang.String PREFS = "PREFS";
    private final java.lang.String FAVORITE_IMAGE = "FAVORITE_IMAGE";
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