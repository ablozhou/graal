/*
 * Copyright (c) 2022, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.svm.graal.stubs;

import org.graalvm.compiler.core.common.Stride;
import org.graalvm.compiler.replacements.nodes.ArrayCompareToNode;
import org.graalvm.nativeimage.Platform.AMD64;
import org.graalvm.nativeimage.Platforms;
import org.graalvm.word.Pointer;

import com.oracle.svm.core.annotate.Uninterruptible;
import com.oracle.svm.core.cpufeature.Stubs;
import com.oracle.svm.core.snippets.SubstrateForeignCallTarget;
import com.oracle.svm.graal.RuntimeCPUFeatureRegion;

@Platforms(AMD64.class)
class SVMArrayCompareToForeignCalls {

    // GENERATED CODE BEGIN

    // GENERATED FROM:
    // compiler/src/org.graalvm.compiler.hotspot.amd64/src/org/graalvm/compiler/hotspot/amd64/AMD64ArrayCompareToStub.java
    // BY: "mx svm-sync-graal-stubs"

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToByteArray(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S1);
    }

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToCharArray(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S2);
    }

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToByteArray(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S1);
    }

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToCharArray(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S2);
    }

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToByteArrayRTC(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures());
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures());
        } finally {
            region.leave();
        }
    }

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToCharArrayRTC(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures());
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures());
        } finally {
            region.leave();
        }
    }

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToByteArrayRTC(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures());
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures());
        } finally {
            region.leave();
        }
    }

    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToCharArrayRTC(Pointer arrayA, int lengthA, Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures());
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures());
        } finally {
            region.leave();
        }
    }

    // GENERATED CODE END
}
