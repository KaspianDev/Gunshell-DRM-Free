package com.jazzkuh.gunshell.utils;

import com.jazzkuh.gunshell.api.enums.BuiltinAmmoActionType;
import com.jazzkuh.gunshell.api.enums.BuiltinThrowableActionType;
import com.jazzkuh.gunshell.common.AmmunitionActionRegistry;
import com.jazzkuh.gunshell.common.ThrowableActionRegistry;
import com.jazzkuh.gunshell.common.actions.ammunition.DemoMenuAction;
import com.jazzkuh.gunshell.common.actions.ammunition.EndCreditsAction;
import com.jazzkuh.gunshell.common.actions.throwable.DemoMenuThrowableAction;
import com.jazzkuh.gunshell.common.actions.throwable.EndCreditsThrowableAction;

public class DevelopmentUtils {

    private DevelopmentUtils() {
    }

    public static void enableDevelopmentFeatures() {
        AmmunitionActionRegistry.registerAction(BuiltinAmmoActionType.END_CREDITS.toString(), EndCreditsAction.class);
        AmmunitionActionRegistry.registerAction(BuiltinAmmoActionType.DEMO_MENU.toString(), DemoMenuAction.class);

        ThrowableActionRegistry.registerAction(BuiltinThrowableActionType.END_CREDITS.toString(), EndCreditsThrowableAction.class);
        ThrowableActionRegistry.registerAction(BuiltinThrowableActionType.DEMO_MENU.toString(), DemoMenuThrowableAction.class);
    }

}
