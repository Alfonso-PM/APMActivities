package com.poapm.apm_activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/poapm/apm_activities/CarruselFragment;", "Landroidx/fragment/app/Fragment;", "()V", "FAVORITE_SOUND", "", "PREFS", "btnDerecha", "Landroid/widget/ImageView;", "btnIzquierda", "btnMrInfo", "Landroid/widget/Button;", "carrusel", "Landroidx/constraintlayout/widget/ConstraintLayout;", "imgPrincipal", "imgSong", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "preferences", "Landroid/content/SharedPreferences;", "soundFav", "Lcom/poapm/apm_activities/Image;", "getSong", "initView", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playSound", "sou", "", "app_debug"})
public final class CarruselFragment extends androidx.fragment.app.Fragment {
    private androidx.constraintlayout.widget.ConstraintLayout carrusel;
    private android.widget.Button btnMrInfo;
    private android.widget.ImageView btnDerecha;
    private android.widget.ImageView btnIzquierda;
    private android.widget.ImageView imgPrincipal;
    private android.widget.ImageView imgSong;
    private com.poapm.apm_activities.Image soundFav;
    private final java.lang.String PREFS = "PREFS";
    private final java.lang.String FAVORITE_SOUND = "FAVORITE_SOUND";
    private android.content.SharedPreferences preferences;
    private final com.squareup.moshi.Moshi moshi = null;
    
    public CarruselFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final com.poapm.apm_activities.Image getSong() {
        return null;
    }
    
    private final void playSound(int sou) {
    }
}