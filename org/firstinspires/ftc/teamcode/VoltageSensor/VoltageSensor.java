/*
 * Copyright (c) 2018 OpenFTC Team
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.firstinspires.ftc.teamcode.VoltageSensor;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.openftc.revextensions2.ExpansionHubEx;

public class VoltageSensor
{
    //The HardwareMap
    HardwareMap hardwareMap;

    //The expansion hub
    ExpansionHubEx expansionHub;


    public void init(HardwareMap ahwMap)
    {
        hardwareMap = ahwMap;

        /*
         * Before init() was called on this user code, REV Extensions 2
         * was notified via OpModeManagerNotifier.Notifications and
         * it automatically took care of initializing the new objects
         * in the hardwaremap for you. Historically, you would have
         * needed to call RevExtensions2.init()
         */

        expansionHub = hardwareMap.get(ExpansionHubEx.class, "Expansion Hub 1");

    }

    public double getVoltage() {
        return expansionHub.read12vMonitor(ExpansionHubEx.VoltageUnits.VOLTS);
    }
}
