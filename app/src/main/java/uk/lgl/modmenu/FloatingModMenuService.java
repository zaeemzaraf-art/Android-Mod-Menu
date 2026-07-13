// ===== ESP TOGGLE =====
addSwitch("ESP", false, new InterfaceBool() {
    @Override
    public void OnWrite(boolean value) {
        ESP(value);
    }
});

// ===== AIMBOT TOGGLE =====
addSwitch("Aimbot", false, new InterfaceBool() {
    @Override
    public void OnWrite(boolean value) {
        Aimbot(value);
    }
});

// ===== AIM SELECT (Head / Neck / Body) with SeekBar =====
addSeekBarSpot("Aim Select", 0, 3, new InterfaceInt() {
    @Override
    public void OnWrite(int value) {
        AimBone(value);
    }
});
// NOTE: This seekbar shows: 0=Head, 1=Neck, 2=Body, 3=None

// ===== FOV SLIDER (0 = OFF, 50-200 = FOV value) =====
addSeekBar("FOV Control", 0, 200, new InterfaceInt() {
    @Override
    public void OnWrite(int value) {
        FovControl(value);
    }
});

// ===== GLOW COLOR CHANGE (Optional) =====
// You can add a color picker or predefined colors
