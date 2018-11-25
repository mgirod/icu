// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package com.ibm.icu.dev.test.number;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ibm.icu.dev.impl.number
	* include/Makefile.in: Regenerated.
	* testsuite/Makefile.in: Regenerated.

2013-12-21  Andreas Tobler  <andreast@gcc.gnu.org>

	* include/private/gcconfig.h: Add FreeBSD powerpc64 defines.

2013-09-20  Alan Modra  <amodra@gmail.com>

	* configure: Regenerate.

2013-09-04  Matthias Klose  <doko@ubuntu.com>

	* Makefile.am (libgcjgc_la_LIBADD): Add EXTRA_TEST_LIBS.
	* Makefile.in: Regenerate.

2013-03-16  Yvan Roux <yvan.roux@linaro.org>

	* include/private/gcconfig.h (AARCH64): New macro (defined only if
	__aarch64__).
	(CPP_WORDSZ): Define for AArch64.
	(MACH_TYPE): Likewise.
	(ALIGNMENT): Likewise.
	(HBLKSIZE): Likewise.
	(OS_TYPE): Likewise.
	(LINUX_STACKBOTTOM): Likewise.
	(USE_GENERIC_PUSH_REGS): Likewise.
	(DYNAMIC_LOADING): Likewise.
	(DATASTART): Likewise.
	(DATAEND): Likewise.
	(STACKBOTTOM): Likewise.
	(NOSYS): Likewise.
	(mach_type_known): Define for AArch64 and comment update.

2013-03-06  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* os_dep.c [SOLARIS_STACKBOTTOM] (GC_solaris_stack_base): New
	function.
	[!BEOS && !AMIGA && !MSWIN32 && !MSWINCE && !OS2 && !NOSYS &&
	!ECOS] (GC_get_stack_base): Use it.
	* include/private/gcconfig.h [SPARC && SUNOS5]
	(SOLARIS_STACKBOTTOM): Define.
	(STACKBOTTOM, HEURISTIC2): Remove.
	[I386 && SUNOS5]
	(SOLARIS_STACKBOTTOM): Define.
	(STACKBOTTOM): Remove.

2012-11-04  Samuel Thibault  <samuel.thibault@gnu.org>

	* configure.ac: Add stanza for *-*-gnu* threads configuration.
	* configure: Regenerate.
	* include/gc_config.h.in: Likewise.
	* dyn_load.c (_GNU_SOURCE): Define for __GNU__.
	* include/gc_config_macros.h (_REENTRANT, GC_PTHREADS): Define for
	GC_GNU_THREADS.
	* include/private/gcconfig.h (DATASTART): Don't define for I386 &&
	HURD.
	(SIG_SUSPEND, SIG_THR_RESTART, SEARCH_FOR_DATA_START): Define for
	I386 && HURD.
	(UNIX_LIKE, REGISTER_LIBRARIES_EARLY): Define for HURD.
	* os_dep.c (GC_init_linux_data_start): Handle for HURD.
	* pthread_support.c (GC_thr_init): Add case for GC_GNU_THREADS.
	* specific.c: Use for GC_GNU_THREADS.
	* threadlibs.c: Add case for GC_GNU_THREADS.

2012-09-14  David Edelsohn  <dje.gcc@gmail.com>

	* configure: Regenerated.

2012-05-16  H.J. Lu  <hongjiu.lu@intel.com>

	* configure: Regenerated.

2012-05-11  H.J. Lu  <hongjiu.lu@intel.com>

	Merge upstream changes
	* include/private/gcconfig.h: (ALIGNMENT): Set to 4 for x32.
	(CPP_WORDSZ): Set to 32 for x32.

2012-02-27  Jack Howarth  <howarth@bromo.med.uc.edu>
	    Patrick Marlier  <patrick.marlier@gmail.com>

	PR boehm-gc/48299
	* testsuite/boehm-gc.c/thread_leak_test.c: Merge upstream changes.

2012-02-23  Patrick Marlier  <patrick.marlier@gmail.com>
	    Jack Howarth  <howarth@bromo.med.uc.edu>

	PR boehm-gc/52179
	* include/gc_config.h.in: Undefine HAVE_PTHREAD_GET_STACKADDR_NP.
	* include/private/gcconfig.h (DARWIN): Define STACKBOTTOM with
	pthread_get_stackaddr_np when available.
	* configure.ac (THREADS): Check availability of pthread_get_stackaddr_np.
	* configure: Regenerate.

2012-02-10  Kai Tietz  <ktietz@redhat.com>

	PR boehm-gc/48514
	* include/gc_config_macros.h (GC_DLL): Define it for mingw-targets
	only, if we are actual in boehm-gc's build and DLL_EXPORT
	is defined.

2011-11-21  Andreas Tobler  <andreast@fgznet.ch>

	* configure: Regenerate.

2011-08-08  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (THREADS): Remove posix95.
	* configure: Regenerate.

2011-07-07  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR target/39150
	* configure.ac (i?86-*-solaris2.[89]): Also accept
	x86_64-*-solaris2.1?.
	* configure: Regenerate.

2011-06-29  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR libgcj/49451
	* include/private/gcconfig.h [IRIX5 && _MIPS_SZPTR == 64]
	(ELF_CLASS): Define.
	* dyn_load.c [IRIX5]: Include <elf.h>.
	Include <obj.h> for O32, <objlist.h> for N32, N64.
	[SUNOS5DL && USE_PROC_FOR_LIBRARIES] (obj_offset): Define.
	[SUNOS4 && USE_PROC_FOR_LIBRARIES] (obj_offset): Define.
	[IRIX5 && !USE_PROC_FOR_LIBRARIES] (struct link_map): Define.
	(__rld_obj_head): Declare.
	(l_next, l_addr, obj_offset): Define.
	(GC_FirstDLOpenedLinkMap): New function.
	[SUNOS4 || SUNOS5DL] (GC_register_dynamic_libraries): Also use on
	IRIX5.
	Use obj_offset.
	[IRIX5 || (USE_PROC_FOR_LIBRARIES && !LINUX]
	(GC_register_dynamic_libraries): Don't use /proc version on IRIX5.

2011-04-19  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (THREADS): Remove decosf1, irix, mach, os2.
	* configure: Regenerate

2011-04-06  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR testsuite/48480
	* testsuite/lib/boehm-gc.exp (boehm-gc-dg-prune): Allow for path
	to ranlib.

2011-03-25  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR boehm-gc/11412
	* configure.ac (THREADCFLAGS): New variable.
	Use it instead of INCLUDES, AM_CPPFLAGS.
	<*-*-kfreebsd*-gnu> (THREADDLLIBS): Rename to THREADLIBS.
	Remove DG/UX support.
	(AC_CONFIG_FILES): Add testsuite/Makefile.
	* Makefile.am (AUTOMAKE_OPTIONS): Use foreign instead of cygnus.
	(SUBDIRS): Add testsuite.
	(libgcjgc_la_LIBADD): Remove $(UNWINDLIBS).
	(AM_CXXFLAGS): Add $(THREADCFLAGS).
	(AM_CFLAGS): Likewise.
	Remove TESTS related variables.
	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* testsuite/Makefile.am: New file.
	* testsuite/Makefile.in: New file.
	* testsuite/lib/boehm-gc.exp: New file.
	* testsuite/config/default.exp: New file.
	* testsuite/boehm-gc.c/c.exp: New file.
	* testsuite/boehm-gc.lib/lib.exp: New file.
	* tests/test.c: Move ...
	* testsuite/boehm-gc.c/gctest.c: ... here.
	* tests/leak_test.c, tests/middle.c, tests/thread_leak_test.c,
	tests/trace_test.c: Move ...
	* testsuite/boehm-gc.c: ... here.
	* testsuite/boehm-gc.c/trace_test.c: Skip everywhere.
	* tests/staticrootslib.c, tests/staticrootstest.c: Move ...
	* testsuite/boehm-gc.lib: ... here.
	* testsuite/boehm-gc.lib/staticrootstest.c: Use dg-add-shlib
	staticrootslib.c.
	* tests/test_cpp.cc: Move ...
	* testsuite/boehm-gc.c++: ... here.

2011-03-21  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (THREADS): Remove solaris.
	* configure: Regenerate.

2011-02-13  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure: Regenerate.

2011-02-02  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac: Don't use libdl on mips-sgi-irix6*.
	* configure: Regenerate.

2011-01-31  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (*-*-solaris2*): Add -lrt to THREADLIBS.
	* configure: Regenerate.

2010-12-10  Iain Sandoe  <iains@gcc.gnu.org>

	* powerpc_darwin_mach_dep.s:  Update for m64.  Add eh frames.
	Do not build or use the picsymbol stub for Darwin >= 9.
	* tests/test.c (reverse_test):  Modify count for ppc64-darwin.
	* pthread_support.c (GC_get_thread_stack_base): Correct a debug
	statement.

2010-11-29  Iain Sandoe  <iains@gcc.gnu.org>
	    Mike Stump  <mrs@gcc.gnu.org>

	PR target/26427
	PR target/33120
	PR testsuite/35710
	* dyn_load.c (GC_register_dynamic_libraries/DARWIN):  Add new writable
	data section names.
	(GC_dyld_name_for_hdr): Adjust layout.
	(GC_dyld_image_add): Adjust layout, add new Darwin sections, adjust
	debug to name the sections.
	(GC_dyld_image_remove): Adjust layout, remove new Darwin sections,
	adjust debug to name the sections.
	(GC_register_dynamic_libraries): Adjust layout.
	(GC_init_dyld): Likewise.
	(GC_register_main_static_data): Likewise.

2010-10-29  Paolo Bonzini  <bonzini@gnu.org>

	* configure: Regenerate.

2010-10-28  Paolo Bonzini  <bonzini@gnu.org>

	* configure.ac: Rewrite DGUX check to use GC_CFLAGS, and -O0 check
	to remove the need for MY_CFLAGS.
	* Makefile.am: Do not use @...@ substitutions.  Use AM_CXXFLAGS,
	AM_CFLAGS and AM_LDFLAGS instead of redefining LTCOMPILE and LINK.
	Use "override" to disable -O2 when required.
	* configure: Regenerate.
	* Makefile.in: Regenerate.
	* include/Makefile.in: Regenerate.

2010-10-11  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* dyn_load.c: Fix typo.
	* pthread_support.c (GC_get_thread_stack_base) [DEBUG_THREADS]:
	Use GC_printf0.

2010-06-15  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (*-*-solaris2.8*): Only usr alternate thread
	library on Solaris 8.
	(*-*-solaris2*): Use regular thread library otherwise.
	* configure: Regenerate.

2010-05-13  Uros Bizjak  <ubizjak@gmail.com>

	* tests/leak_test.c (main): Declare as int.  Return 0.
	* tests/thread_leak_test.c (main): Ditto.
	* tests/trace_test.c (main): Ditto.

2010-05-06  Dave Korn  <dave.korn.cygwin@gmail.com>

	PR target/42811
	* tests/staticrootstest.c: New test source file.
	* tests/staticrootslib.c: New test library source file.
	* Makefile.am (test_ldadd): New variable.
	(gctest_LDADD): Use it.
	(TESTS): Add leaktest, middletest and staticrootstest.
	(check_PROGRAMS): Likewise.
	(leaktest_SOURCES): New libtool variable definition.
	(leaktest_LDADD): Likewise.
	(leaktest_LDFLAGS): Likewise.
	(leaktest_LINK): Likewise.
	(middletest_SOURCES): Likewise.
	(middletest_LDADD): Likewise.
	(middletest_LDFLAGS): Likewise.
	(middletest_LINK): Likewise.
	(staticrootstest_SOURCES): Likewise.
	(staticrootstest_LDADD): Likewise.
	(staticrootstest_LDFLAGS): Likewise.
	(staticrootstest_LINK): Likewise.
	(check_LTLIBRARIES): Likewise.
	(libstaticrootslib_la_SOURCES): Likewise.
	(libstaticrootslib_la_LIBADD): Likewise.
	(libstaticrootslib_la_LDFLAGS): Likewise.
	(libstaticrootslib_la_DEPENDENCIES): Likewise.
	* Makefile.in: Regenerate.

2010-04-02  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.in: Regenerate.
	* aclocal.m4: Regenerate.
	* include/Makefile.in: Regenerate.

2010-03-21  Dave Korn  <dave.korn.cygwin@gmail.com>

	PR target/42811 (prerequisite)
	* include/private/gc_priv.h (struct roots) [CYGWIN32]: Don't
	declare r_next member on Cygwin as on other windows hosts.
	(LOG_RT_SIZE) [CYGWIN32]: Don't define likewise.
	(RT_SIZE) [CYGWIN32]: Likewise.
	(struct _GC_arrays) [CYGWIN32]: Do declare _heap_bases[] member
	likewise.
	(GC_heap_bases) [CYGWIN32]: Do define likewise.
	(struct _SYSTEM_INFO) [CYGWIN32]: Do forward-declare likewise.
	(GC_sysinfo) [CYGWIN32]: Do declare extern likewise.
	(GC_n_heap_bases) [CYGWIN32]: Likewise.
	(GC_is_tmp_root) [CYGWIN32]: Do prototype likewise.
	* include/private/gcconfig.h (GC_win32_get_mem) [CYGWIN32]: Likewise.
	(GET_MEM) [CYGWIN32]: Do define likewise.
	* boehm-gc/ptr_chck.c (GC_is_visible) [CYGWIN32]: Do handle dynamic
	registration likewise.
	* boehm-gc/os_dep.c (GC_setpagesize) [CYGWIN32]: Do define likewise.
	(GC_no_win32_dlls) [CYGWIN32]: Define as constant false, unlike
	other windows hosts.
	(GC_sysinfo) [CYGWIN32]: Define as on other windows hosts.
	(GC_n_heap_bases) [CYGWIN32]: Likewise.
	(GLOBAL_ALLOC_TEST) [CYGWIN32]: Likewise.
	(GC_win32_get_mem) [CYGWIN32]: Likewise, but wrapping GC_unix_get_mem
	rather than GlobalAlloc/VirtualAlloc.
	(GC_win32_free_heap) [CYGWIN32]: Likewise, but wrapping free instead
	of GlobalFree (even though the function body is optimised away).
	* boehm-gc/mark_rts.c (add_roots_to_index) [CYGWIN32]: Define as on
	other windows hosts.
	(GC_add_roots_inner) [CYGWIN32]: Avoid overlapping or adjacent
	intervals likewise.
	(GC_clear_roots) [CYGWIN32]: Clear GC_root_index[] likewise.
	(GC_rebuild_root_index) [CYGWIN32]: Define as on other windows hosts.
	(GC_remove_tmp_roots) [CYGWIN32]: Call it likewise.
	(GC_remove_roots) [CYGWIN32]: Don't define, as on other windows hosts.
	(GC_is_tmp_root) [CYGWIN32]: Define, as on other windows hosts.
	(GC_cond_register_dynamic_libraries) [CYGWIN32]: Handle temporary
	roots and dynamic registration likewise.
	* boehm-gc/dyn_load.c (GC_has_static_roots) [CYGWIN32]: Define as on
	other windows hosts.
	(GC_register_has_static_roots_callback) [CYGWIN32]: Likewise.
	(GC_cond_add_roots) [CYGWIN32]: Likewise.
	(GC_register_main_static_data) [CYGWIN32]: Define to always return
	false, as on MSWINCE
	(HAVE_REGISTER_MAIN_STATIC_DATA) [CYGWIN32]: Define as on other
	windows hosts.
	(GC_warn_fb) [CYGWIN32]: Likewise.
	(GC_disallow_ignore_fb) [CYGWIN32]: Likewise.
	(GC_ignore_fb_mb) [CYGWIN32]: Likewise.
	(GC_ignore_fb) [CYGWIN32]: Likewise.
	(is_frame_buffer) [CYGWIN32]: Likewise.
	(GC_dump_meminfo) [CYGWIN32]: Likewise.
	(GC_wnt) [CYGWIN32]: Define to constant true.
	(GC_register_dynamic_libraries) [CYGWIN32]: Define as on other
	windows hosts.

2009-12-09  Matthias Klose  <doko@ubuntu.com> 

	* include/private/gc_locks.h: For __ARM_EABI__ define
	GC_test_and_set  GC_clear to use the atomic builtins.

2009-12-05  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* include/Makefile.in: Regenerate.

2009-11-30  Ben Elliston  <bje@au.ibm.com>

	* mark_rts.c (GC_approx_sp): Use __builtin_frame_address when
	compiling with GCC rather than taking the address of a local
	variable.

2009-11-30  Ben Elliston  <bje@au.ibm.com>

	* os_dep.c: Use the POSIX signal API in preference to the BSD API.
	Generate a compilation error if neither the POSIX nor BSD APIs can
	be detected.

2009-09-11  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.am (libgcjgc_la_LINK, gctest_LINK): New.
	(gctest_LDADD): Depend on libgcjgc.la instead of ./libgcjgc.la,
	so that library dependency resolution works with portable make.
	* Makefile.in: Regenerate.

2009-09-08  Alexandre Oliva  <aoliva@redhat.com>

	* configure: Rebuilt with modified libtool.m4.

2009-09-03  Loren J. Rittle  <ljrittle@acm.org>

	* dyn_load.c (HAVE_DL_ITERATE_PHDR): Break definition from use.
	Define for FreeBSD 7.0+.

2009-08-24  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure.ac (AC_PREREQ): Bump to 2.64.

2009-08-22  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.am (install-html, install-pdf): Remove.
	* Makefile.in: Regenerate.

	* Makefile.in: Regenerate.
	* aclocal.m4: Regenerate.
	* configure: Regenerate.
	* include/Makefile.in: Regenerate.
	* include/gc_config.h.in: Regenerate.

2009-08-22  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.am (LTCOMPILE, LTLINK): Add $(AM_LIBTOOLFLAGS)
	and $(LIBTOOLFLAGS).
	* Makefile.in: Regenerate.

2009-07-30  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure.ac (_AC_ARG_VAR_PRECIOUS): Use m4_rename_force.

2009-07-17  Michael Meissner  <meissner@linux.vnet.ibm.com>

	PR boehm-gc/40785
	* include/private/gc_locks.h (GC_test_and_set): If GCC 4.4, use
	the __sync_lock_test_and _set and __sync_lock_release builtins on
	the powerpc.  If not GCC 4.4, fix up the constraints so that it
	builds without error.
	(GC_clear): Ditto.

2009-07-17  Kai Tietz  <kai.tietz@onevision.com>

	* configure.ac: Add rule for mingw targets to add -DGC_BUILD=1 to
	cflags.
	* configure: Regenerated.

2009-05-17  Dave Korn  <dave.korn.cygwin@gmail.com>

	* win32_threads.c (GC_get_thread_stack_base):  Implement for Cygwin.

2009-03-01  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure: Regenerate.

2009-02-09  Mark Mitchell  <mark@codesourcery.com>

	* Makefile.am (LTLDFLAGS): New variable.
	(LINK): Use it.
	* Makefile.in: Regenerated.

2008-12-18  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure: Regenerate.

2008-09-26  Peter O'Gorman  <pogma@thewrittenword.com>
	    Steve Ellcey  <sje@cup.hp.com>

	* configure: Regenerate for new libtool.
	* Makefile.in: Ditto.
	* include/Makefile.in: Ditto.
	* aclocal.m4: Ditto.

2008-07-18  Matthias Klose  <doko@ubuntu.com> 
 
	* configure.ac (AC_CONFIG_FILES): Add threads.mk. 
	* threads.mk.in: New. 
	* Makefile.in, configure: Regenerate. 

2008-06-17  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* include/Makefile.in: Regenerate.
	* include/gc_config.h.in: Regenerate.

2008-04-18  Paolo Bonzini  <bonzini@gnu.org>

	PR bootstrap/35457
	* aclocal.m4: Regenerate.
	* configure: Regenerate.

2008-03-16  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* aclocal.m4: Regenerate.
	* configure: Likewise.
	* Makefile.in: Likewise.
	* include/Makefile.in: Likewise.

2007-02-19  Andreas Tobler  <a.tobler@schweiz.org>

	* dyn_load.c (GC_dyld_image_add): Remove ifdef clause and use the macro
	GC_GETSECTBYNAME instead.
	* include/private/gc_priv.h: Define GC_GETSECTBYNAME according to the
	architecture (Darwin).

2008-01-26  Richard Sandiford  <rsandifo@nildram.co.uk>

	* include/private/gcconfig.h (HBLKSIZE): Define for MIPS.

2008-01-24  David Edelsohn  <edelsohn@gnu.org>

	* configure: Regenerate.

2007-10-10  John David Anglin  <dave.anglin@nrc-cnrc.gc.ca>

	PR boehm-gc/33442
	* pthread_support.c (GC_PTR GC_get_thread_stack_base): If stack grows
	up, return stack_addr instead of stack_addr - stack_size.

2007-08-14  David Daney  <ddaney@avtrex.com>

	* include/private/gcconfig.h: Handle mips64-linux n64 ABI.

2007-07-05  H.J. Lu  <hongjiu.lu@intel.com>

	* aclocal.m4: Regenerated.

2007-07-02  Rainer Orth  <ro@TechFak.Uni-Bielefeld.DE>

	PR boehm-gc/21940
	PR boehm-gc/21942
	* configure.ac (GC_SOLARIS_THREADS): Don't define on *-*-solaris*.
	Use alternate thread library in /usr/lib/lwp.
	* configure: Regenerate.
	* dyn_load.c: Use GC_SOLARIS_PTHREADS.
	* include/gc_config_macros.h (GC_SOLARIS_THREADS): Don't define.
	* include/private/gcconfig.h: Handle 64-bit Solaris 2/x86.
	(GC_SOLARIS_THREADS): Don't define.
	* include/private/solaris_threads.h: Remove.
	* pthread_support.c (GC_thr_init) [GC_SOLARIS_PTHREADS]: Determine
	GC_nprocs via sysconf().
	* Makefile.am (libgcjgc_la_SOURCES): Remove solaris_pthreads.c and
	solaris_threads.c.
	(gctest_LDADD): Use THREADLIBS instead of THREADDLLIBS.
	* Makefile.in: Regenerate.	 
	* solaris_pthreads.c: Remove.
	* solaris_threads.c: Remove.

2007-06-22  Jakub Jelinek  <jakub@redhat.com>

	* pthread_support.c (GC_get_thread_stack_base): Handle
	pthread_getattr_np failures.

2007-06-02  Paolo Bonzini  <bonzini@gnu.org>

	* configure: Regenerate.

2007-05-23  Steve Ellcey  <sje@cup.hp.com>

	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* aclocal.m4: Regenerate.
	* include/Makefile.in: Regenerate.

2007-05-20  Andreas Tobler  <a.tobler@schweiz.org>

	* configure.ac: Introduce extra_ldflags_libgc. Use it for Darwin.
	* configure: Regenerate.
	* Makefile.am (libgc_la_LDFLAGS): Use extra_ldflags_libgc.
	* Makefile.in: Regenerate.
	* include/Makefile.in: Regenerate.
	* include/private/gcconfig.h: Enable MPROTECT_VDB for all Darwin
	targets. Remove comments. Prepare ppc64 support for Darwin.

2007-04-23  Keith Seitz  <keiths@redhat.com>

	* include/gc.h (GC_is_thread_suspended): Declare.
	* pthread_stop_world.c (GC_is_thread_suspended): New function.

2007-04-03  Jakub Jelinek  <jakub@redhat.com>

	* configure.ac (NO_EXECUTE_PERMISSION): Set by default.
	* configure: Rebuilt.

2007-03-07  Alexandre Oliva  <aoliva@redhat.com>

	* include/gc.h (GC_REGISTER_FINALIZER_UNREACHABLE): New.
	(GC_register_finalizer_unreachable): Declare.
	(GC_debug_register_finalizer_unreachable): Declare.
	* finalize.c (GC_unreachable_finalize_mark_proc): New.
	(GC_register_finalizer_unreachable): New.
	(GC_finalize): Handle it.
	* dbg_mlc.c (GC_debug_register_finalizer_unreachable): New.
	(GC_debug_register_finalizer_no_order): Fix whitespace.

2007-03-01  Brooks Moses  <brooks.moses@codesourcery.com>

	* Makefile.am: Add dummy install-pdf target.
	* Makefile.in: Regenerate

2007-02-05  Roman Zippel <zippel@linux-m68k.org>

	* boehm-gc/include/private/gcconfig.h: use LINUX_STACKBOTTOM so
	it works with Linux 2.6, reactivate MPROTECT_VDB
	* boehm-gc/pthread_stop_world.c: save all register
	on signal entry

2007-01-24  Andreas Tobler  <a.tobler@schweiz.org>

	* os_dep.c (defined(MPROTECT_VDB) && defined(DARWIN)): Moved recently
	added defines to include/private/gc_priv.h
	(catch_exception_raise): Added THREAD_FLD in exc_state for POWERPC too.
	* darwin_stop_world.c: Removed the above defines.
	* include/private/gc_priv.h: Moved definitions from darwin_stop_world.c
	and os_dep.c to here. Fixed THREAD definition fixes for ppc64.

2007-01-17  David Daney  <ddaney@avtrex.com>

	* configure.ac: Don't define NO_SIGSET and NO_DEBUGGING while
	cross-compiling.
	* configure: Regenerated.
	* include/gc_config.h.in: Regenerated.

2007-01-17  Mike Stump  <mrs@apple.com>

	* os_dep.c: Fix i686-apple-darwin9 builds.

2007-01-16  Jack Howarth  <howarth@bromo.med.uc.edu>

	* aclocal.m4: Regenerate to use multi.m4.
	* configure: Regenerate.
	* Makefile.in: Regenerate.

2007-01-17  Andreas Tobler  <a.tobler@schweiz.org>

	* include/gc_config.h.in: Regenerate.

2007-01-16  Petr Salinger  <Petr.Salinger@seznam.cz>

	* include/private/gcconfig.h: Handle amd64/x86-64 cpu under
	 GNU/kFreeBSD.
	* os_dep.c: Likewise.

2007-01-15  Andreas Tobler  <a.tobler@schweiz.org>

	* os_dep.c (defined(MPROTECT_VDB) && defined(DARWIN)): Adjust mail
	reference.
	(catch_exception_raise): Fix typo in the I386 exc_state.

2007-01-11  Andreas Tobler  <a.tobler@schweiz.org>

	* configure.ac: Replaced HAS_I386_THREAD_STATE_* with
	HAS_X86_THREAD_STATE32_* and HAS_X86_THREAD_STATE64_* respectively.
	* configure: Regenerated.
	* include/private/gcconfig.h (DARWIN): Added X86_64 define for Darwin.
	Added base definitions for the X86_64 Darwin port.
	* include/private/gc_priv.h: Added definitions for Darwin MACH thread
	operations. Moved existing THREAD_STATE info from darwin_stop_world.c.
	* darwin_stop_world.c: Removed THREAD_STATE info. Added
	HAS_X86_THREAD_STATE64___RAX. And replaced HAS_I386_THREAD_STATE___EAX
	with HAS_X86_THREAD_STATE32___EAX.
	(GC_push_all_stacks): Use GC_MACH_THREAD_STATE_COUNT. Add code for
	X86_64 Darwin.
	* dyn_load.c (GC_dyld_name_for_hdr): Use GC_MACH_HEADER.
	(GC_dyld_image_add): Use GC_MACH_HEADER and GC_MACH_SECTION.
	Distinguish between getsectbynamefromheader_64 and
	getsectbynamefromheader.
	(GC_dyld_image_remove): Likewise.
	* os_dep.c (GC_dirty_init): Use GC_MACH_THREAD_STATE.
	(catch_exception_raise): Introduce exception information for I386 and
	X86_64 Darwin. Add X86_64 for exc_state.faultvaddr.

2006-12-08  Mike Stump  <mrs@apple.com>

	* configure.ac: Fix x86 darwin builds.
	* darwin_stop_world.c: Likewise.
	* include/private/gcconfig.h: Likewise.
	* connfigure: Regenerate.
	
2006-09-26  Jack Howarth  <howarth@bromo.med.uc.edu>

	PR target/29180
	* darwin_stop_world.c: Make stack_start unsigned long.

2006-09-21  Sandro Tolaini  <tolaini@libero.it>

	* os_dep.c: Port to Darwin/i386
	* darwin_stop_world.c: Likewise
	* include/private/gcconfig.h: Likewise
	
2006-06-07  Petr Salinger  <Petr.Salinger@seznam.cz>

	* configure.ac: add support for GNU/kFreeBSD, accepted by upstream
	for gc 6.8.
	* dyn_load.c: Likewise.
	* include/gc.h: Likewise.
	* private/gcconfig.h: Likewise.
	* configure: Regenerate.
	* include/gc_config.h.in: Regenerate.

2006-09-14  Tom Tromey  <tromey@redhat.com>

	PR boehm-gc/29068.
	* misc.c (GC_init_inner): Don't use GC_get_thread_stack_base on
	Solaris.

2006-08-21  Bryce McKinlay  <mckinlay@redhat.com>
	
	PR libgcj/13212:
	* configure.ac: Check for pthread_getattr_np(). Remove
	GC_PTHREAD_SYM_VERSION detection.
	* include/gc.h (GC_register_my_thread, GC_unregister_my_thread,
	GC_get_thread_stack_base): New declarations.
	* pthread_support.c (GC_register_my_thread, GC_unregister_my_thread,
	GC_get_thread_stack_base): New functions.
	(GC_delete_thread): Don't try to free the first_thread.
	* misc.c (GC_init_inner): Use GC_get_thread_stack_base() if possible.
	(pthread_create_, constr): Removed.
	(pthread_create): Don't rename.
	* include/gc_ext_config.h.in: Rebuilt.
	* include/gc_pthread_redirects.h (pthread_create): Define 
	unconditionally.
	* include/gc_config.h.in: Rebuilt.
	* configure: Rebuilt.

2006-06-21  Keith Seitz  <keiths@redhat.com>

	* pthread_stop_world.c (GC_suspend_handler): Redirect to suspension
	routine if signal is received and thread is flagged SUSPENDED.
	(suspend_self): New function.
	(GC_suspend_thread): New function.
	(GC_resume_thread): New function.
	* include/gc.h (GC_suspend_thread): Declare.
	(GC_resumet_thread): Declare.
	* include/private/pthread_support.h (SUSPENDED): New GC_thread
	flag.

2006-06-20  Ranjit Mathew  <rmathew@gcc.gnu.org>
	
	Backport Windows 9x/ME VirtualQuery() fix from GC 6.7.
	* os_dep.c (GC_wnt): Define.
	(GC_init_win32): Set GC_wnt.
	* dyn_load.c (GC_register_dynamic_libraries): Consider MEM_PRIVATE
	sections also on Windows 9x/ME.

2006-06-02  Geoffrey Keating  <geoffk@apple.com>

	* configure.ac: Define HAS_PPC_THREAD_STATE_R0,
	HAS_PPC_THREAD_STATE___R0, HAS_PPC_THREAD_STATE64_R0,
	HAS_PPC_THREAD_STATE64___R0, HAS_I386_THREAD_STATE_EAX,
	HAS_I386_THREAD_STATE___EAX.
	* configure: Regenerate.
	* include/gc_config.h.in: Regenerate.
	* darwin_stop_world.c (PPC_RED_ZONE_SIZE): Use standard Darwin
	macro names to determine value.
	(THREAD_STATE): New.
	(THREAD_FLD): New.
	(GC_push_all_stacks): Use THREAD_STATE and THREAD_FLD in both versions.

2006-05-24  Carlos O'Donell  <carlos@codesourcery.com>

	* Makefile.am: Add install-html target. 
	* Makefile.in: Regenerate.
	* aclocal.m4: Regenerate.
	* include/Makefile.in: Regenerate.

2006-03-07  Andrew Haley  <aph@redhat.com>

	* dyn_load.c (GC_has_static_roots): Declare.
	(GC_register_dynlib_callback): Call GC_has_static_roots.

2006-04-11  Bryce McKinlay  <mckinlay@redhat.com>

	* darwin_stop_world.c (GC_push_all_stacks, GC_stop_world,
	GC_start_world): Call vm_deallocate to free act_list. Fix from
	Bruce Mitchener.

2006-03-24  Andreas Tobler  <a.tobler@schweiz.ch>
	John David Anglin  <dave.anglin@nrc-cnrc.gc.ca>

	* configure.ac (THREADS): Add REENTRANT for *-*-hpux11*.
	Warn about POSIX threads not being supported for *-*-hpux10*.
	* configure: Regenerate.

2006-02-09  Tom Tromey  <tromey@redhat.com>

	* pthread_support.c: Conditionally include dlfcn.h.

2006-02-06  Jakub Jelinek  <jakub@redhat.com>
	    Anthony Green  <green@redhat.com>
	    Tom Tromey  <tromey@redhat.com>

	* include/gc_ext_config.h.in: Added GC_PTHREAD_SYM_VERSION.
	* include/gc_config.h.in: Rebuilt.
	* include/gc_pthread_redirects.h (pthread_create): Conditionally
	define.
	* pthread_support.c (pthread_create_): New global.
	(constr): New function.
	(pthread_create): Conditionally renamed.
	* configure: Rebuilt.
	* configure.ac (GC_PTHREAD_SYM_VERSION): Define.

2006-02-04  Alan Modra  <amodra@bigpond.net.au>

	* include/private/gc_locks.h (GC_test_and_set <POWERPC>): Don't
	use broken 64-bit version.

2006-01-25  Andreas Tobler  <a.tobler@schweiz.ch>

	* darwin_stop_world.c: Change inline asm instruction to ld as ldz
	is wrong.

	* Makefile.am (asm_libgcjgc_sources): Rename to asm_libgcjgc_sources.
	* Makefile.in: Regenerate.

2006-01-25  Bryce McKinlay  <mckinlay@redhat.com>

	* include/private/gcconfig.h: Revert to GC 6.6 version, removing
	all local changes.

2006-01-24  Bryce McKinlay  <mckinlay@redhat.com>

	Import Boehm GC version 6.6.

2006-01-24  David Ayers  <d.ayers@inode.at>

	PR libobjc/13946
	* include/gc.h: Fix prototype declarations for bootstrap.

2005-11-01  Bryce McKinlay  <mckinlay@redhat.com>

	* include/private/gc_priv.h: Increase MAX_ROOT_SETS to 1024.

2005-09-15  Kazu Hirata  <kazu@codesourcery.com>

	* include/private/gc_locks.h (GC_test_and_set): Change the
	constraint of the first operand to '0'.

2005-09-06  Tom Tromey  <tromey@redhat.com>

	PR libgcj/23662:
	* include/private/gcconfig.h (LINUX_STACKBOTTOM): Use instead of
	HEURISTIC1 on ARM.

2005-07-17  SUGIOKA Toshinobu  <sugioka@itonet.co.jp>

	* include/private/gcconfig.h (sh-linux): Use LINUX_STACKBOTTOM.

2005-06-15  Andreas Tobler  <a.tobler@schweiz.ch>

	* os_dep.c: Add FreeBSD/PowerPC bits.
	(GC_SysVGetDataStart): Likewise.
	* include/private/gcconfig.h: Likewise.

2005-05-25  Andrew Haley  <aph@redhat.com>

	* include/private/